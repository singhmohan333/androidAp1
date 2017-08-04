package com.example.mohan.workout;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts (String spinner)
    {
        List <String> workout = new ArrayList<String>();

        if (spinner.equals("chest"))
        {
            workout.add("bench Press");
            workout.add("cable flys");
            workout.add("bench Press");
            workout.add("cable flys");
        }
        else if (spinner.equals("Triceps"))

        {
            workout.add("Tricept expert");
            workout.add("Tricept Pushdown");
            workout.add("bench Press");
            workout.add("cable flys");

        }

        else if (spinner.equals("shoulder"))

        {
            workout.add("Shoulder press");
            workout.add("bench Press");
            workout.add("cable flys");
            workout.add("cable flys");
        }

        else if (spinner.equals("Biceps"))

        {
            workout.add("Biceps curls ");
            workout.add("bench Press");
            workout.add("cable flys");
            workout.add("cable flys");

        }

        else if (spinner.equals("none"))

        {
            workout.add("go to home and take rest");

        }

        return workout ;
    }
}
