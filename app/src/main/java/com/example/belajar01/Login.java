package com.example.belajar01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, pass;
    Button login;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //lakuka proses binding dari xml (action_login) ke java (login.java)

        user = findViewById(R.id.txt_username);
        pass = findViewById(R.id.txt_password);
        login = findViewById(R.id.btn_login);

        username = "ujang";
        password = "ujang";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals(username) && pass.getText().toString().equals(password)){
                    Intent intent = new Intent(Login.this, Homepage.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(Login.this, "Username / Password salah ! ",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
