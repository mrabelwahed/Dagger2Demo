package com.example.mahmoud.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mahmoud on 03/04/18.
 */

@Module
public class MyModule {
    @Provides
    @Singleton
    static MyExample provideMyExample(){
     return new MyExampleImpl();
    }
}
