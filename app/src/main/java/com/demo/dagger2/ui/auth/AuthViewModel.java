package com.demo.dagger2.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.demo.dagger2.di.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    String TAG = "AuthViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi){
        this.authApi = authApi;
        if(authApi==null)
            Log.d(TAG, "AuthViewModel: Auth viewmodel is NULL");
        else
            Log.d(TAG, "AuthViewModel: Auth view model is not null");
    }
}
