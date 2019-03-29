package com.example.modulsatu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class modul3 extends AppCompatActivity{

    EditText username, password;
    String usr_name = "andik";
    String pass = "160411100106";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanmodul3);

        username = findViewById(R.id.inpt_nama);
        password = findViewById(R.id.input_pass);

    }
    public void login(View view) {
        if (username.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukan Username dan Password Anda", Toast.LENGTH_SHORT).show();
        } else if (username.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukan Username Anda", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukan Password Anda", Toast.LENGTH_SHORT).show();
        } else if (!username.getText().toString().equals(usr_name) || !password.getText().toString().equals(pass)) {
            Toast.makeText(this, "Username atau Password Anda Salah", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, modul2.class);
            //intent.putExtra("asd", username.getText().toString());
            startActivity(intent);
        }
    }



}


