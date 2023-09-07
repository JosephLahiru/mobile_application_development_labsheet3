package me.mtron.mobile_application_development_labsheet3.exercise_03_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet3.R;

public class SignIn extends AppCompatActivity {

    EditText userName;
    EditText password;

    Button signIn;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        userName = findViewById(R.id.userNameText3);
        password = findViewById(R.id.passwordText4);
        signIn = findViewById(R.id.signInBtn);

        intent = new Intent(this, LastActivity.class);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences data2 = getSharedPreferences("details", MODE_PRIVATE);
                String uname = data2.getString("USERNAME", "USERNAME not stored");
                String pwd = data2.getString("PASSWORD", "PASSWORD not stored");

                if(uname.equals(userName.getText().toString()) && pwd.equals(password.getText().toString())){
                    startActivity(intent);
                }
            }
        });
    }
}