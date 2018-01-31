package com.example.prasad.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    private String TAG= SignUp.class.getSimpleName();
    private EditText editTextName,editTextUserName,getEditTextEmail,getEditTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
              //  Toast.makeText(Main3Activity.this, "Successful", Toast.LENGTH_SHORT).show();
                String name = editTextName.getText().toString();
                 if (editTextName.getText().toString().trim().length()==0)
                 {
                     editTextName.setError("Enter Name");
                 }
                if (editTextUserName.getText().toString().trim().length()==0)
                {
                    editTextUserName.setError("Enter Name");
                }
                if (getEditTextEmail.getText().toString().trim().length()==0)
                {
                    getEditTextEmail.setError("Enter Name");
                }
                if (getEditTextPassword.getText().toString().trim().length()==0)
                {
                    getEditTextPassword.setError("Enter Name");
                }

                else
                 {
                     Intent intent=new Intent(Main3Activity.this,MainActivity.class);
                     intent.putExtra("myName", name);
                     startActivity(intent);
                 }
            }
        });
    }
}
