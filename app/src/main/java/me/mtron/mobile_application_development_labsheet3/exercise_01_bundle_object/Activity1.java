package me.mtron.mobile_application_development_labsheet3.exercise_01_bundle_object;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    EditText userName;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        userName = findViewById(R.id.userNameText1);
        password = findViewById(R.id.passwordText1);
        login = findViewById(R.id.loginBtn);


    }
}