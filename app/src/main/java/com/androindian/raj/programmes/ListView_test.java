package com.androindian.raj.programmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView_test extends AppCompatActivity {

    ListView listView;
    String Course[]={"Android","Java","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        listView=findViewById(R.id.list);


        ArrayAdapter arrayAdapter=new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                Course);
        listView.setAdapter(arrayAdapter);
    }
}
