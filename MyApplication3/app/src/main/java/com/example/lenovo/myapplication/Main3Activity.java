package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
   private Button homeManu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        homeManu=(Button)findViewById(R.id.HomeActivity3);

        View.OnClickListener listener=new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this,MainActivity.class);
                Main3Activity.this.startActivity(intent);
                finish();
            }
        };
        homeManu.setOnClickListener(listener);


    }
}
