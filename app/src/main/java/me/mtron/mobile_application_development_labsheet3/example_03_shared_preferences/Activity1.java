package me.mtron.mobile_application_development_labsheet3.example_03_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    EditText townTxt;
    EditText nameTxt;
    Button read;
    Button write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        nameTxt = findViewById(R.id.nameTxt1);
        townTxt = findViewById(R.id.townTxt1);
        read = findViewById(R.id.readBtn);
        write = findViewById(R.id.writeBtn);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences data1 = getSharedPreferences("details", MODE_PRIVATE);
                SharedPreferences.Editor editor = data1.edit();
                editor.putString("NAME", nameTxt.getText().toString());
                editor.putString("TOWN", townTxt.getText().toString());
                editor.commit();
                Toast.makeText(getApplicationContext(), "Data Stored", Toast.LENGTH_SHORT).show();
            }
        });

    }
}