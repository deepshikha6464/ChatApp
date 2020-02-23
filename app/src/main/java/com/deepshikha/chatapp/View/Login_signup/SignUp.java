package com.deepshikha.chatapp.View.Login_signup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.deepshikha.chatapp.R;
import com.deepshikha.chatapp.databinding.SignUpBinding;
import com.deepshikha.chatapp.model.LoginUser;
import com.deepshikha.chatapp.viewModel.LoginViewModel;

public class SignUp extends DialogFragment {
    private LoginViewModel loginViewModel;
    private SignUpBinding signUpBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        signUpBinding = SignUpBinding.inflate(inflater,container,false);

        signUpBinding.setLifecycleOwner(this);
        signUpBinding.setLoginViewModel(loginViewModel);

        loginViewModel.getLoginUser().observe(this, new Observer<LoginUser>() {
            @Override
            public void onChanged(LoginUser loginUser) {

            }
        });

        return signUpBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((InputMethodManager) (getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE)).toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

}
