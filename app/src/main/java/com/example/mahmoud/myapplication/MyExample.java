package com.example.mahmoud.myapplication;

import java.util.Date;

/**
 * Created by mahmoud on 03/04/18.
 */

public class MyExample {
    private static MyExample INSTANCE;
    private long datetime;
    private MyExample(){

    }

    public static MyExample getInstance(){
        if (INSTANCE == null)
            INSTANCE = new MyExample();
        return INSTANCE;
    }

    public long getDatetime(){
        return new Date().getTime();
    }
}
