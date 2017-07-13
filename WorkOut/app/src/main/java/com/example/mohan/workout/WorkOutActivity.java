package com.example.mohan.workout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class WorkOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);

    }

  public void onClickWork (View view){

      TextView workouts = (TextView) findViewById(R.id.textView);

     Spinner workoutss = (Spinner) findViewById(R.id.spinner);

      String workoutput = String.valueOf(workoutss.getSelectedItem());

      workouts.setText(workoutput);

  }


    }
