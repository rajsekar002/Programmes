package com.androindian.raj.programmes;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button camera,StartService,StopService,adv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        camera=findViewById(R.id.button2);
        StartService=findViewById(R.id.button3);
        StopService=findViewById(R.id.button4);
        adv_view=findViewById(R.id.button5);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //Intent intent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        String Mobile=intent.getStringExtra("Mobile");
        String Pass=intent.getStringExtra("Password");

        Toast.makeText(getApplicationContext(),
                ""+Mobile+" "+Pass,Toast.LENGTH_LONG).show();


        StartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),
                        Myservice.class);
                startService(intent1);
            }
        });

        StopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),
                        Myservice.class);
                stopService(intent1);
            }
        });

        adv_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),
                        AdvancedViews.class);
                startActivity(intent1);
            }
        });

    }
}
