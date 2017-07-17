package com.example.mohan.intentapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Bundle firstData = getIntent().getExtras();

        if (firstData==null)
        {
            return;
        }

        String firstMessage = firstData.getString("firstMessage");

        final TextView secondtext = (TextView) findViewById(R.id.SecondText);
        secondtext.setText(firstMessage);
    }

}
