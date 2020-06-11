package com.gmail.kaminskyisem.testGit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {
    private static String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent startIntent = getIntent();

    }
    @Override protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart2, :"+this);
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume2, :"+this);
    }

    @Override protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause2, :"+this);

    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop2, :"+this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy2, :"+this);
    }

}