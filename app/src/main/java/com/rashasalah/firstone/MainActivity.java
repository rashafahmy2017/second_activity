package com.rashasalah.firstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String t2 = "";
    TextView te ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    private void show (View v){
//         te =(TextView)findViewById(R.id.ne);
//        TextView t1 =(TextView)findViewById(R.id.mobile_edit);
//         t2 = (String) t1.getText();
//        display(t2);
//    }
//    public void display (String s){
//        te.setText(t2);
//    }
}
