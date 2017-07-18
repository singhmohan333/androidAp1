package com.example.mohan.listapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String list [] = {"Fruits Names", "Apple", "Mango", "Banana", "Pine apple", "Graps", "Apricot", "Avocado", "Bilberry", "Blackberry",
                "Blackcurrant","Blueberry", "Currant", "Cherimoya ", "Cloudberry","Cranberry","Cucumber ","Custard apple",
                "Damson ","Date","Dragonfruit","Durian","Elderberry ","Feijoa ", "Cherry", "Fig", "Goji berry", "Gooseberry"
        };

        ListAdapter myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(

                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String list = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, list, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
