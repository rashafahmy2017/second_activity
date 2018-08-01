package com.rashasalah.firstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO show what inside the grid item layout
        super.onCreate(savedInstanceState);
        // TODO Data activity
        setContentView(R.layout.activity_main);
               UserData user_data;

        user_data= new UserData("Ahmed","333-444-512-615","+96 0102 814 57","ahmed@yahoo.com","470");
      TextView name = (TextView) findViewById(R.id.name);
        name.setText(user_data.getName());
        TextView ticket_num = (TextView) findViewById(R.id.ticket_num);
        ticket_num.setText(user_data.get_ticket_num());
        TextView phone_num = (TextView) findViewById(R.id.mobile_edit);
        phone_num.setText(user_data.get_phone_num());
        TextView email_address = (TextView) findViewById(R.id.email_edit);
        email_address.setText(user_data.get_email_addreaa());
        TextView cash_sar = (TextView) findViewById(R.id.sar_data);
        cash_sar.setText(user_data.get_Sar_data());
        //TODO Grid activity
//        setContentView(R.layout.grid_layout_item);
//        ArrayList<Grid_Data> grid= new ArrayList<>();
//        ArrayList<Grid_Data> finish= new ArrayList<>();
//        Grid_Data grid_data;
//
//        for (int i = 0; i <10; i++) {
//            grid_data= new Grid_Data("day"+i,"name"+i,i+"tickets","date"+i,"time"+i);
//            grid.add(grid_data);
////            day.add(grid.get(i).get_day());
//
//        }
//
//        GridItem_Adapter gridAdapter= new GridItem_Adapter(MainActivity.this);
//        gridAdapter.adapter(grid);
//        ((ListView)findViewById(R.id.Day_List)).setAdapter(gridAdapter);
    //TODO  payment activity
//      setContentView(R.layout.payment_layout);
//       Pay_Data pay_data;
//
//            pay_data= new Pay_Data("330","120","650","1000","card");
//      TextView pay_1 = (TextView) findViewById(R.id.pay_1_1);
//        pay_1.setText(pay_data.getPay_1());
//        TextView mobile_num = (TextView) findViewById(R.id.pay_2_2);
//        mobile_num.setText(pay_data.getPay_2());
//        TextView email_address = (TextView) findViewById(R.id.pay_3_3);
//        email_address.setText(pay_data.getPay_3());
//        TextView pay_4 = (TextView) findViewById(R.id.sum_total);
//        pay_4.setText(pay_data.getPay_4());
//        TextView type = (TextView) findViewById(R.id.cash);
//        type.setText(pay_data.getPay_type());
    }
}
