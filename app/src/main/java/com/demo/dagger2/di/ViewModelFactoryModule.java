package com.demo.dagger2.di;

import androidx.lifecycle.ViewModelProvider;

import com.demo.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelProviderFactory factory);
}
