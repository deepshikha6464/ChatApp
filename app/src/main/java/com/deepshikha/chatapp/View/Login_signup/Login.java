package com.deepshikha.chatapp.View.Login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.deepshikha.chatapp.R;

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
