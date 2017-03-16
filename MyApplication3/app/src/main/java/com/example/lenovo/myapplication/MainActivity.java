package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     private Button manu;
     private Button help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        help=(Button) this.findViewById(R.id.helpButton);
        manu=(Button)this.findViewById(R.id.manuButton);
        View.OnClickListener listener=new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        };
        View.OnClickListener listener1=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,Main3Activity.class);
                MainActivity.this.startActivity(intent1);
                finish();
            }
        };
        manu.setOnClickListener(listener);
        help.setOnClickListener(listener1);
    }
}
