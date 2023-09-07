package me.mtron.mobile_application_development_labsheet3.example_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    EditText name;
    EditText address;
    Button login;
    Bundle bundle;
    Intent check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.signInBtn);
        name = findViewById(R.id.nameTxt);
        address = findViewById(R.id.addressTxt);

        check = new Intent(this, Activity2.class);
        bundle = new Bundle();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("ADDRESS", address.getText().toString());
                bundle.putString("NAME", name.getText().toString());

                check.putExtras(bundle);

                startActivity(check);
            }
        });
    }
}