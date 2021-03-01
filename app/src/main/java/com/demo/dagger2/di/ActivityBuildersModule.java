package com.demo.dagger2.di;

import com.demo.dagger2.di.auth.AuthViewModelsModule;
import com.demo.dagger2.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class})
    abstract AuthActivity contributesAuthActivity();


}
