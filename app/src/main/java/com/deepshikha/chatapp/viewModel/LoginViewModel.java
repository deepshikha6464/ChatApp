package com.deepshikha.chatapp.viewModel;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.deepshikha.chatapp.View.Login_signup.SignUp;
import com.deepshikha.chatapp.model.LoginUser;

public class LoginViewModel extends ViewModel {

    private static final String TAG = "LoginViewModel";
    //ui
    Context context;

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

//sign up button
    public void onClick(View view) {
//data from textfield
        LoginUser User = new LoginUser(userid.getValue(), password.getValue());
//data saved as user
        loginUser.setValue(User);

        //checking for registration
        if (userid.equals("")) {
            userid.setValue("can't be blank");
        } else if (password.equals("")) {
            password.setValue("can't be blank");
        } else {
            final ProgressDialog pd = new ProgressDialog(context);
            pd.setMessage("Loading...");
            pd.show();

            //api call for registration


        }
    }
}
