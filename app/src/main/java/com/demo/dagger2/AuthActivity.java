package com.demo.dagger2;


import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {
    
    @Inject String someString;

    @Inject boolean isAppNull;
    private static final String TAG = "AuthActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        Log.d(TAG, "onCreate: String : "+someString);
        Log.d(TAG,"onCreate: is app null? "+isAppNull);


    }
}