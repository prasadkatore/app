package com.example.prasad.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.intentdemo.R;

public class SignUp extends AppCompatActivity {

    private String TAG= SignUp.class.getSimpleName();
    private EditText editTextName,editTextUserName,getEditTextEmail,getEditTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Log.e(TAG, "onCreate: " );
        init();

    }

    private void init() {
        Log.e(TAG, "init: " );
        editTextName=findViewById(R.id.editTextname);
        editTextUserName=findViewById(R.id.editTextusername);
        getEditTextEmail=findViewById(R.id.editTextemail);
        getEditTextPassword=findViewById(R.id.editTextpassword);

        Button buttonsignup=findViewById(R.id.buttonsignup);




        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "onClick: " );
                Toast.makeText(SignUp.this, "Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
