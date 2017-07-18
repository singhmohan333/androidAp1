package com.example.mohan.mydataapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText myInput;

    TextView myText;


    MyDBHandler dbHandler;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        myInput = (EditText) findViewById(R.id.myInput);

        myText = (TextView) findViewById(R.id.myText);

        dbHandler =new  MyDBHandler(this,null,null,1);

        printDatabase();

    }

    public void printDatabase(){

        String dbSting= dbHandler.databasetostring();

        myText.setText(dbSting);

        myInput.setText("");

    }

    public void addButtonClick(View view)

    {

        Products products = new Products(myInput.getText().toString());

        dbHandler.addProduct(products);

        printDatabase();

    }

    public void deleteButtonClick(View view)

    {

        String inputText= myInput.getText().toString();

        dbHandler.deleteProduct(inputText);

        printDatabase();

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

}