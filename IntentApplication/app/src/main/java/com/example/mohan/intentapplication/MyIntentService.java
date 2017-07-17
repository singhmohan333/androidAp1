package com.example.mohan.intentapplication;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyIntentService extends IntentService{


     private static final String TAG="com.example.mohan.intentapplication";
    public MyIntentService(String name) {
        super("MyIntentService");
    }

            @Override
            protected void onHandleIntent(Intent intent) {

                Log.i(TAG, "The service is started" );

    }
}
