package me.mtron.mobile_application_development_labsheet3.exercise_01_bundle_object;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    Bundle bundle;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        nameText = findViewById(R.id.nameText1);
        indexText = findViewById(R.id.cityText1);
        departmentText = findViewById(R.id.usernameText1);
        facultyText = findViewById(R.id.passwordText3);
        btnOk = findViewById(R.id.okBtn);
        bundle = new Bundle();
        intent = new Intent(this, Activity3.class);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("NAME", nameText.getText().toString());
                bundle.putString("INDEX", indexText.getText().toString());
                bundle.putString("DEPARTMENT", departmentText.getText().toString());
                bundle.putString("FACULTY", facultyText.getText().toString());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}