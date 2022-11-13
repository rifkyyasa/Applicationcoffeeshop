package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity1 extends AppCompatActivity {

    String username="admin";
    String password="admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        getSupportActionBar().hide();

        final TextView signUpBtn = findViewById(R.id.signupbtn);

        EditText txtUser=findViewById(R.id.txtuser);
        EditText txtPassword=findViewById(R.id.txtpassword);
        Button login=findViewById(R.id.loginbtn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUser.getText().toString().equalsIgnoreCase(username)&&txtPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity1.this,MenuUtama.class));
                }else{
                    Toast.makeText(MainActivity1.this,"Username atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity1.this,RegisterPage.class));
            }
        });


    }
}