package com.demo.dagger2.di;

import android.app.Application;

import com.demo.dagger2.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, ActivityBuildersModule.class})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
