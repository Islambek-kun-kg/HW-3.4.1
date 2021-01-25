package com.example.hw_341;

import android.os.Parcel;
import android.os.Parcelable;

public class PrintInfo implements Parcelable {

    private String name;

    public PrintInfo(String name) {
        this.name = name;
    }
    protected PrintInfo(Parcel in) {
        name = in.readString();
    }

    public static final Creator<PrintInfo> CREATOR = new Creator<PrintInfo>() {
        @Override
        public PrintInfo createFromParcel(Parcel in) {
            return new PrintInfo(in);
        }
        @Override
        public PrintInfo[] newArray(int size) {
            return new PrintInfo[size];
        }
    };

    public String getName()
    {
        return name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}