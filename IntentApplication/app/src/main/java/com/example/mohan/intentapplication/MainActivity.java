package com.example.mohan.intentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, MyService.class);
        startService(i);


    }

        public void onclick(View view ){
            Intent i = new Intent(this,Activitytwo.class);
            final EditText firstInput = (EditText) findViewById(R.id.firstInput);

            String usermessage = firstInput.getText().toString();
            i.putExtra("firstMessage",usermessage);
            startActivity(i);


               }

}
