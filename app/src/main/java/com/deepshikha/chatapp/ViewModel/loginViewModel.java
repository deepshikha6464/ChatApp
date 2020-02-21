package com.deepshikha.chatapp.ViewModel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.deepshikha.chatapp.model.LoginUser;

public class loginViewModel extends ViewModel {

    private static final String TAG = "loginViewModel";

    //vars
    public MutableLiveData<String> userid = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public MutableLiveData<LoginUser> loginUser = new MutableLiveData<>();

    public MutableLiveData<LoginUser> getLoginUser()
    {
        if (loginUser == null) {
            loginUser = new MutableLiveData<>();
        }
        return loginUser;
    }


    public void onClick(View view) {

        LoginUser User = new LoginUser(userid.getValue(), password.getValue());

        loginUser.setValue(User);

    }
}
