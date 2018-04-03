package com.example.mahmoud.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mahmoud on 03/04/18.
 */

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
