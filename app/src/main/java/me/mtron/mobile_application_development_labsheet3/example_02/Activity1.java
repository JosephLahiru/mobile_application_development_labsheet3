package me.mtron.mobile_application_development_labsheet3.example_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import me.mtron.mobile_application_development_labsheet3.R;

public class Activity1 extends AppCompatActivity {

    private static final String MAIN_ACTIVITY_TAG = Activity1.class.getSimpleName();

    private void showLog(String text){
        Log.d(MAIN_ACTIVITY_TAG, text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        showLog("Activity Created");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity destroyed");
    }
}