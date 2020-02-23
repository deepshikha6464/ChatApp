package com.deepshikha.chatapp.View.Login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.deepshikha.chatapp.R;
import com.deepshikha.chatapp.View.chat.MainActivity;

public class Login extends AppCompatActivity {
//ui
    TextView signup;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp sign = new SignUp();
                sign.show(getSupportFragmentManager(),"signup");

            }
        });



    }

}
