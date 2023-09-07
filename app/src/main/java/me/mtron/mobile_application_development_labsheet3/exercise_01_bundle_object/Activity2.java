package me.mtron.mobile_application_development_labsheet3.exercise_01_bundle_object;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity2 extends AppCompatActivity {

    EditText nameText;
    EditText indexText;
    EditText departmentText;
    EditText facultyText;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        nameText = findViewById(R.id.nameText1);
        indexText = findViewById(R.id.indexNumText1);
        departmentText = findViewById(R.id.departmentText1);
        facultyText = findViewById(R.id.facultyText1);
        btnOk = findViewById(R.id.okBtn);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}