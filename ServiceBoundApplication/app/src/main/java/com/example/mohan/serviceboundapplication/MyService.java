package com.example.mohan.serviceboundapplication;

import android.app.Service;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Binder;
import android.os.IBinder;

import java.util.Date;
import java.util.Locale;

public class MyService extends Service {

    private final IBinder myBinder = new MyLocalBinder();
    public MyService() {
    }


    public class MyLocalBinder extends Binder{

        MyService getService(){

            return MyService.this;

        }
    }



    public String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss",Locale.US);
        return (df.format(new Date()));
    }

    public IBinder onBind(Intent intent) {
        return myBinder;
    }
}
