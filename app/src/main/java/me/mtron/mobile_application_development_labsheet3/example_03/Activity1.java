package me.mtron.mobile_application_development_labsheet3.example_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    Button toastBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        toastBtn = findViewById(R.id.btnToast);
    }

    public void showToast(View view) {
        Toast msg = Toast.makeText(this, "The Button Was Clicked!!!", Toast.LENGTH_SHORT);
        msg.show();
    }
}