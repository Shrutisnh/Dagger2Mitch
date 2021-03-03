package com.demo.dagger2.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.demo.dagger2.di.network.auth.AuthApi;
import com.demo.dagger2.models.User;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {
    String TAG = "AuthViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi){
        this.authApi = authApi;

        authApi.getUser(1)
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull User user) {
                        Log.d(TAG, "onNext: "+user.getEmail());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError: "+e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
