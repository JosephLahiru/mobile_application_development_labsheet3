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

public class SignUp extends AppCompatActivity {

    EditText name;
    EditText city;
    EditText userName;
    EditText password;

    Button backBtn;
    Button signUpBtn;

    Intent back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.nameText1);
        city = findViewById(R.id.cityText1);
        userName = findViewById(R.id.usernameText1);
        password = findViewById(R.id.passwordText3);
        backBtn = findViewById(R.id.backBtn);
        signUpBtn = findViewById(R.id.signUpBtn);

        back = new Intent(this, Main.class);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(back);
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences data1 = getSharedPreferences("data", MODE_PRIVATE);
                SharedPreferences.Editor editor = data1.edit();
                editor.putString("NAME", name.getText().toString());
                editor.putString("CITY", city.getText().toString());
                editor.putString("USERNAME", userName.getText().toString());
                editor.putString("PASSWORD", password.getText().toString());
                editor.commit();
                Toast.makeText(getApplicationContext(), "You have signed up successfully!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}