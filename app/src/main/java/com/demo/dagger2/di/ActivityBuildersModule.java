package com.demo.dagger2.di;

import com.demo.dagger2.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector
    abstract AuthActivity contributesAuthActivity();

    @Provides
    static String getSomeString(){
        return "this is a test string";
    }

}
