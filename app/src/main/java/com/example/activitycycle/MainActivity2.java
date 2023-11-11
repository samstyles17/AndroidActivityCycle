package com.example.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView lifecycleTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       lifecycleTV = findViewById(R.id.textView4);
        appendLifecycleMessage("onCreate() : The Activity has 'Created'\n");

    }
    @Override
    protected void onStart(){
        super.onStart();
        appendLifecycleMessage("onStart() : The Activity has 'started'\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        appendLifecycleMessage("onResume() : The Activity has 'Resumed'\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        appendLifecycleMessage("onPause() : The Activity has 'Paused'\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        appendLifecycleMessage("onStop() : The Activity has 'Stopped'\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        appendLifecycleMessage("onRestart() : The Activity has 'Restarted'\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        appendLifecycleMessage("onDestroy() : The Activity has 'Destroyed'\n");
    }

    private void appendLifecycleMessage(String message) {
        lifecycleTV.append(message + "\n");
    }
}