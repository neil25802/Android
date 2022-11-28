package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bookkeeping extends AppCompatActivity implements View.OnClickListener {

    final String TAG = this.getClass().getSimpleName();
    private View view;

    TextView theDate, theTime;
//    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookkeeping_constraintlayout);

        Log.d(TAG, "enter onCreate()");
        uiInit();
    }
    private void uiInit () {
        theDate = findViewById(R.id.textView3);
        theTime = findViewById(R.id.textView7);
    }

    @Override
    protected void onStart() {
        super.onStart();
        varInit();
        setUiListener();
        Log.d(TAG, "enter onStart()");
    }

    private void setUiListener() {
        theDate.setOnClickListener(this);
        theTime.setOnClickListener(this);
    }

    private void varInit() {
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop()");
        releaseUiListener();
        super.onStop();
    }

    private void releaseUiListener() {
        theDate.setOnClickListener(null);
        theTime.setOnClickListener(null);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "enter onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "enter onResume()");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "enter onPause()");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "enter onRestart()");
        super.onRestart();
    }

    @Override
    public void onClick(View view) {
    }
}