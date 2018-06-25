package com.androindian.raj.programmes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent=getIntent();
        String Mobile=intent.getStringExtra("Mobile");
        String Pass=intent.getStringExtra("Password");

        Toast.makeText(getApplicationContext(),
                ""+Mobile+" "+Pass,Toast.LENGTH_LONG).show();

    }
}
