package com.example.mahmoud.myapplication;

import android.app.Application;

/**
 * Created by mahmoud on 03/04/18.
 */

public class MyApplication extends Application {
    private MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();

    }


    MyComponent getMyComponent(){
        return myComponent;
    }

    MyComponent createMyComponent(){
    return DaggerMyComponent.builder().myModule(new MyModule()).build();

    }
}
