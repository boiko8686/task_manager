package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button today;
    private Button routines;
    private Button remainder;
    private Button chart;
    private Button homeMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        remainder=(Button)findViewById(R.id.remainders) ;

                View.OnClickListener listener5= new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Main2Activity.this,Main6Activity.class);
                        Main2Activity.this.startActivity(intent);
                        finish();
                    }
                };


        routines=(Button)findViewById(R.id.routines);

        View.OnClickListener listener4=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main5Activity.class);
                Main2Activity.this.startActivity(intent);
                finish();
            }
        };



        today=(Button)findViewById(R.id.today) ;

        View.OnClickListener listener3=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                Main2Activity.this.startActivity(intent);
                finish();
            }
        };

        chart=(Button) this.findViewById(R.id.chartButton);
        homeMenu2=(Button)this.findViewById(R.id.HomeActivity2) ;
        View.OnClickListener listener=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                Main2Activity.this.startActivity(intent);
                finish();
            }
        };

        View.OnClickListener listener2=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main2Activity.this,Main7Activity.class);
                Main2Activity.this.startActivity(intent2);
                finish();
            }
          };
          chart.setOnClickListener(listener2);
        homeMenu2.setOnClickListener(listener);
        today.setOnClickListener(listener3);
        routines.setOnClickListener(listener4);
        remainder.setOnClickListener(listener5);
    }
}
