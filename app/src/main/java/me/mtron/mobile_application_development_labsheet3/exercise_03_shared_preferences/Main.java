package me.mtron.mobile_application_development_labsheet3.exercise_03_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.mtron.mobile_application_development_labsheet3.R;

public class Main extends AppCompatActivity {

    Button signIn;
    Button signUp;

    Intent signUpIntent;
    Intent signInIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        signIn = findViewById(R.id.signIn);
        signUp = findViewById(R.id.signUp);
        signInIntent = new Intent(this, SignIn.class);
        signUpIntent = new Intent(this, SignUp.class);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signInIntent);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signUpIntent);
            }
        });
    }
}