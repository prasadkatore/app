package com.example.intentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Kailas on 24-Jan-18.
 */

public class SecondActivity extends AppCompatActivity {
    private String TAG = SecondActivity.class.getSimpleName();
    private TextView textViewName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        getValuesFromIntent();
    }

    private void getValuesFromIntent() {
        Log.e(TAG, "getValuesFromIntent: ");
        String name = getIntent().getExtras().getString("myName");
        textViewName.setText(name);

    }

    private void initViews() {
        Log.e(TAG, "initViews: ");
        textViewName = findViewById(R.id.textViewName);
    }
}
