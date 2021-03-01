package com.demo.dagger2.di.auth;

import androidx.lifecycle.ViewModel;

import com.demo.dagger2.di.ViewModelKey;
import com.demo.dagger2.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
@Module
public abstract class AuthViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindViewModel(AuthViewModel viewModel);
}
