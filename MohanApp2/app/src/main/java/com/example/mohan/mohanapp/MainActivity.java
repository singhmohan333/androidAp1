package com.example.mohan.mohanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout myLayout =   new RelativeLayout(this);

        Button myButton = new Button(this);



        myLayout.setBackgroundColor(Color.GREEN);
        myButton.setBackgroundColor(Color.RED);

        myButton.setText("CLick Here");

        RelativeLayout.LayoutParams buttonDetails =
               new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
             buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
             buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);


        myLayout.addView(myButton, buttonDetails);

            EditText username = new EditText(this );

        myButton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams usernameDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        usernameDetails.addRule(RelativeLayout.ABOVE, myButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        usernameDetails.setMargins(0,0,0,50);
        myLayout.addView(username, usernameDetails);

         setContentView(myLayout);
    }


}
