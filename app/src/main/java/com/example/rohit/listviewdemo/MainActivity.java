package com.example.rohit.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String> arrayList=new ArrayList<>();
        arrayList.add("Rohit");
        arrayList.add("Busanwa");
        arrayList.add("Sidhya");
        arrayList.add("Khauf");
        arrayList.add("Schanx");
        ListView listView=(ListView)findViewById(R.id.listViewDynamic);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selected value = "+arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
