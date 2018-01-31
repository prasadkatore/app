package com.example.prasad.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private String TAG = MainActivity.class.getSimpleName();
    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: " );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

    }

    private void initview() {

        Log.e(TAG, "initview: " );
        editTextUsername=findViewById(R.id.editText);
        editTextPassword=findViewById(R.id.editText2);
        Button buttonsubmit=findViewById(R.id.button);
        Button buttonclear=findViewById(R.id.button2);
        Button buttonsignup=findViewById(R.id.button3);
        



       buttonsubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.e(TAG, "onClick: " );
               goToSecondActivity();
           }
       });

       buttonclear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.e(TAG, "onClick: " );
               editTextUsername.setText("");
               editTextPassword.setText("");
               clearControl();
               editTextUsername.setSelection(0);
           }
       });


       buttonsignup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Log.e(TAG, "onClick: " );
               goToThirdActivity();
           }
       });
    }

    private void goToThirdActivity() {
        Log.e(TAG, "goToThirdActivity: " );
        Intent intent=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);

    }

    private void goToSecondActivity() {

        Log.e(TAG, "goToSecondActivity: ");
//        String name = editTextUsername.getText().toString();
       String name = getIntent().getExtras().getString("myName");

        if (editTextUsername.getText().toString().trim().length()==0)
        {
            editTextUsername.setError("Enter Name");
        }
        if (editTextPassword.getText().toString().trim().length()==0)
        {
            editTextPassword.setError("Enter Name");
        }
        if(!editTextUsername.equals(name))
        {
            editTextUsername.setError("Wrong username");
        }
        else
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("myName", name);
            startActivity(intent);
        }


    }

    private void clearControl() {
        Log.e(TAG, "clearControl: ");
        editTextUsername.setText("");
        editTextPassword.setText("");
        editTextUsername.setFocusableInTouchMode(true);
        editTextUsername.requestFocus();

    }

    private void getValuesFromEditTextView() {

        Log.e(TAG, "getValuesFromEditTextView: " );
        String username=editTextUsername.getText().toString();
        String password=editTextPassword.getText().toString();
        Log.e(TAG, "getValuesFromEditTextView: Username= " + username + "   Password= " +password );



    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart: " );
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume: " );
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy: " );
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause: " );
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: " );
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "onRestart: " );
        super.onRestart();
    }

}
