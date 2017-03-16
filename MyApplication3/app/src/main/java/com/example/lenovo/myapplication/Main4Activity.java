package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

   private Button homeMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        homeMenu=(Button)findViewById(R.id.HomeActivity4);

        View.OnClickListener listener=new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main4Activity.this,MainActivity.class);
                Main4Activity.this.startActivity(intent);
                finish();
            }
        };
        homeMenu.setOnClickListener(listener);

    }
}
