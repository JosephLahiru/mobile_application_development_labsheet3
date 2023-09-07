package me.mtron.mobile_application_development_labsheet3.exercise_03_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet3.R;

public class LastActivity extends AppCompatActivity {

    TextView name;
    TextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        name = findViewById(R.id.text1);
        city = findViewById(R.id.text22);

        SharedPreferences data2 = getSharedPreferences("data", MODE_PRIVATE);
        String _name = data2.getString("NAME", "NAME not stored");
        String _city = data2.getString("CITY", "CITY not stored");

        name.setText(_name);
        city.setText(_city);
    }
}