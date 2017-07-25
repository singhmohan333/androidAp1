package com.example.mohan.userapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.TextureView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    EditText passwordInput;
    TextView myText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.usernameInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
         myText = (TextView) findViewById(R.id.myText);

    }

    public void saveInfo(View view ){

        SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editer = sharedpref.edit();
        editer.putString("username",userInput.getText().toString());
        editer.putString("password ",passwordInput.getText().toString());

        editer.apply();

        Toast.makeText(this,"saved", Toast.LENGTH_LONG).show();


    }


    public void displayInfo(View view){

        SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
            String name = sharedpref.getString("username", "");
            String pw = sharedpref.getString("password", "");

        myText.setText(name + "  " + pw);




    }


}
