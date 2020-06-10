package com.gmail.kaminskyisem.testGit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static String LOG_TAG = MainActivity.class.getSimpleName();
    private Button heiMEButton;

    View.OnClickListener btnOnKlick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(LOG_TAG, "hit me on Click"+v);

            Intent i = new Intent(MainActivity.this,MainActivity2.class);
//            i.putExtra();
            startActivity(i);
        }
    }git

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heiMEButton = findViewById(R.id.btn_hit_me);
        Log.d(LOG_TAG, "onCreate,:" + this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "on start,:" + this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "on RESUME,:" + this);
    }


}