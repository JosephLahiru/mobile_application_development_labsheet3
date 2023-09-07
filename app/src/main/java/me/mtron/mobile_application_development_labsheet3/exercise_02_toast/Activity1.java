package me.mtron.mobile_application_development_labsheet3.exercise_02_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        firstName = findViewById(R.id.firstNameText1);
        lastName = findViewById(R.id.lastNameText1);
        showBtn = findViewById(R.id.submitBtn);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity1.this, "Full Name: " + firstName.getText().toString() + " " + lastName.getText().toString() + "\n", Toast.LENGTH_SHORT).show();
            }
        });
    }
}