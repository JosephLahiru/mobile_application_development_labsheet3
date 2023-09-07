package me.mtron.mobile_application_development_labsheet3.exercise_01_bundle_object;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity3 extends AppCompatActivity {

    TextView nameText;
    TextView indexText;
    TextView departmentText;
    TextView facultyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        nameText = findViewById(R.id.nameText2);
        indexText = findViewById(R.id.indexNumText2);
        departmentText = findViewById(R.id.departmentText2);
        facultyText = findViewById(R.id.facultyText2);

        Intent content = getIntent();
        Bundle get = content.getExtras();

        nameText.setText(get.getString("NAME"));
        indexText.setText(get.getString("INDEX"));
        departmentText.setText(get.getString("DEPARTMENT"));
        facultyText.setText(get.getString("FACULTY"));
    }
}