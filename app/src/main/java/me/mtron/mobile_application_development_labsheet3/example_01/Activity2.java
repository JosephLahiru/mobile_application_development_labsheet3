package me.mtron.mobile_application_development_labsheet3.example_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity2 extends AppCompatActivity {

    TextView name;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name = findViewById(R.id.nameText);
        address = findViewById(R.id.addressText);

        Intent content = getIntent();
        Bundle get = content.getExtras();

        name.setText(get.getString("NAME"));
        address.setText(get.getString("ADDRESS"));
    }
}