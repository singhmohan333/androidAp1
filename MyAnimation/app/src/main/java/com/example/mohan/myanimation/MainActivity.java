package com.example.mohan.myanimation;

import android.animation.FloatEvaluator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.test.ViewAsserts;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

     ViewGroup myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (ViewGroup) findViewById(R.id.main_view);

        myLayout.setOnTouchListener(
                   new RelativeLayout.OnTouchListener(){
                       public boolean onTouch (View v, MotionEvent event)
                       {
                           movebutton();
                           return true;
                       }
                   }


        );

    }



    public void movebutton(){
        TransitionManager.beginDelayedTransition(myLayout);

          View my_button = findViewById(R.id.my_button);
         RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                 RelativeLayout.LayoutParams.WRAP_CONTENT,
                 RelativeLayout.LayoutParams.WRAP_CONTENT

         );

        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        my_button.setLayoutParams(positionRules);

         ViewGroup.LayoutParams sizeRules = my_button.getLayoutParams();
        sizeRules.width=450;
        sizeRules.height=300;
        my_button.setLayoutParams(sizeRules);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
