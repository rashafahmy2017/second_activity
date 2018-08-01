package com.rashasalah.firstone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridItem_Adapter extends BaseAdapter {
    private Context context;
    public static ArrayList<Grid_Data> data= new ArrayList<Grid_Data>();;
    private final String BASE_URL = "WEB URL";
    TextView day;
    public GridItem_Adapter(Context context) {
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
    public void adapter(ArrayList<Grid_Data> movie) {
        this.data= movie;
    }
    public ArrayList<Grid_Data> getmymovies(){
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

        row = LayoutInflater.from(context).inflate(R.layout.grid_item, null);

        name = (TextView) row.findViewById(R.id.name);
        name.setText(data.get(position).getName());
        TextView num_ticket = (TextView) row.findViewById(R.id.num_ticket);
        num_ticket.setText(data.get(position).get_num_ticket());
        TextView date = (TextView) row.findViewById(R.id.date);
        date.setText(data.get(position).get_date());
        TextView time= (TextView) row.findViewById(R.id.time_from_to);
        time.setText(data.get(position).get_time());

//        imageView.setImageDrawable(context.getResources().getDrawable( R.drawable.birthdayimage));
//        Picasso.with(context).load(movie.get(position).getUrl()).into(imageView);

        return row;
    }
}
