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

import java.util.List;

public class WorkOutActivity extends AppCompatActivity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);

    }

  public void onClickWork (View view){

      TextView workouts = (TextView) findViewById(R.id.textView);

     Spinner workoutss = (Spinner) findViewById(R.id.spinner);

      String workoutput = String.valueOf(workoutss.getSelectedItem());

//      workouts.setText(workoutput);

      List <String> workoutList = expert.getWorkouts(workoutput);
      StringBuilder workoutFormatted = new StringBuilder();

      for (String work : workoutList) {
          workoutFormatted.append(work).append('\n');
      }

      workouts.setText(workoutFormatted);

  }


    }
