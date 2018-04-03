package com.example.mahmoud.myapplication;

import java.util.Date;

/**
 * Created by mahmoud on 03/04/18.
 */

public class MyExampleImpl implements MyExample {
    long datetime;

    public MyExampleImpl() {
        datetime = new Date().getTime();
    }

    @Override
    public long getDate() {
        return datetime;
    }
}
