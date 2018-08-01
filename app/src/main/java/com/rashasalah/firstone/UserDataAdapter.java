package com.rashasalah.firstone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserDataAdapter extends BaseAdapter{
    private Context context;
    public static ArrayList<UserData> data= new ArrayList<UserData>();

    public UserDataAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int position) {
        return""+ position;
    }
    public static Object getData(int position) {
        return data.get(position);
    }
    public void adapter(ArrayList<UserData> data) {
        this.data= data;
    }
    public ArrayList<UserData> getmymovies(){
        return data;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = new View(context);
        TextView name;

        row = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
        name = (TextView) row.findViewById(R.id.name);
        TextView ticket_num = (TextView) row.findViewById(R.id.ticket_num);
        name.setText(data.get(position).getName());
        ticket_num.setText(data.get(position).get_ticket_num());
        TextView mobile_num = (TextView) row.findViewById(R.id.mobile_edit);
        mobile_num.setText(data.get(position).get_phone_num());
        TextView email_address = (TextView) row.findViewById(R.id.email_edit);
        email_address.setText(data.get(position).get_email_addreaa());
        TextView paid_date = (TextView) row.findViewById(R.id.sar_data);
        paid_date.setText(data.get(position).get_Sar_data());

//        Picasso.with(context).load(movie.get(position).getUrl()).into(imageView);

        return row;
    }
}
