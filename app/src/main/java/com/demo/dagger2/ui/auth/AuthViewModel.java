package com.demo.dagger2.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    String TAG = "AuthViewModel";

    @Inject
    public AuthViewModel(){
        Log.d(TAG, "AuthViewModel: injected");
    }
}
