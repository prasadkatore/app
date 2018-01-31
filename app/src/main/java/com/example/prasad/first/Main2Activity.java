package com.example.prasad.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String TAG= Main2Activity.class.getSimpleName();
    private TextView textViewname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: " );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        getValuesFromIntent();
    }

    private void getValuesFromIntent() {
        Log.e(TAG, "getValuesFromIntent: " );
        String name=getIntent().getExtras().getString("myName");
        textViewname.setText(name);
    }

    private void init() {
        Log.e(TAG, "init: " );
        textViewname=findViewById(R.id.textViewname);
    }

}
