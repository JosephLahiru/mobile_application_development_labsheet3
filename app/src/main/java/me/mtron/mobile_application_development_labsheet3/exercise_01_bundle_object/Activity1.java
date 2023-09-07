package me.mtron.mobile_application_development_labsheet3.exercise_01_bundle_object;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    EditText userName;
    EditText password;
    Button login;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        userName = findViewById(R.id.userNameText1);
        password = findViewById(R.id.passwordText1);
        login = findViewById(R.id.loginBtn);
        intent = new Intent(this, Activity2.class);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("user") && password.getText().toString().equals("root")){
                    startActivity(intent);
                }else{
                    Toast.makeText(Activity1.this, "Invalid credentials.\nCheck your username and password!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}