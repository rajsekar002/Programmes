package com.androindian.raj.programmes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdvancedViews extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_views);
    }

    public void list_one(View view){
        Intent intent=new Intent(AdvancedViews.this,
                ListView_test.class);
        startActivity(intent);
    }

    public void list_two(View view){
        Intent intent=new Intent(AdvancedViews.this,
                ListView_custom.class);
        startActivity(intent);
    }

    public void list_three(View view){
        Intent intent=new Intent(AdvancedViews.this,
                ListView_res.class);
        startActivity(intent);
    }
}
