package com.example.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    private String TAG = FirstActivity.class.getSimpleName();
    private EditText editTextName;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initViews();

    }

    private void initViews() {
        Log.e(TAG, "initViews: ");
        editTextName = findViewById(R.id.editTextName);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: ");
                goToSecondActivity();
            }
        });

    }

    private void goToSecondActivity() {
        Log.e(TAG, "goToSecondActivity: ");
        String name = editTextName.getText().toString();
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("myName", name);
        startActivity(intent);
    }
}
