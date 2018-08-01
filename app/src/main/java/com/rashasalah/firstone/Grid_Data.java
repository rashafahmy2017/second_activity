package com.rashasalah.firstone;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Grid_Data extends ArrayList<Grid_Data> implements Parcelable {
    private String Day = "";
    private String date = "";
    private String num_ticket = "";
    private String name = "";
    private String time = "";
    public static ArrayList<Grid_Data> data= new ArrayList<Grid_Data>();;

    public Grid_Data() {
    }

    public Grid_Data( String Day,String name, String num_ticket ,String date, String time) {
        this.name = name;
        this.date = date;
        this.num_ticket = num_ticket;
        this.Day = Day;
        this.time=time;
    }

    protected Grid_Data(Parcel in) {
        name = in.readString();
        date = in.readString();
        num_ticket = in.readString();
        time = in.readString();
        Day = in.readString();
    }

    public static final Creator<UserData> CREATOR = new Creator<UserData>() {
        @Override
        public UserData createFromParcel(Parcel in) {
            return new UserData(in);
        }

        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void set_day(String Day) {
        this.Day = Day;
    }

    public String get_day() {
        return Day;
    }

    public String get_num_ticket() {
        return num_ticket;
    }
    public void set_num_ticket(String num_ticket) {
        this.num_ticket = num_ticket;
    }

    public void set_date(String date) {
        this.date = date;
    }
    public String get_date() {
        return date;
    }

    public void get_time(String time) {
        this.time = time;
    }
    public String get_time() {
        return time;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Day);
        parcel.writeString(name);
        parcel.writeString(time);
        parcel.writeString(date);
        parcel.writeString(num_ticket);
    }


}
