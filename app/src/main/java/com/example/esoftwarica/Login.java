package com.example.esoftwarica160352;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.etusername);
        password=findViewById(R.id.etpassword);
        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    if(view.getId() == R.id.btnlogin){
        String username1 = username.getText().toString();
        String password1 = password.getText().toString();

     if(username1.equals("softwarica")  && password1.equals("coventry") ) {
         Intent intent = new Intent(this, MainActivity.class);
         startActivity(intent);
     }
     else {
         Toast.makeText(this, username1+password1, Toast.LENGTH_SHORT).show();
     }
 }
    }
}
