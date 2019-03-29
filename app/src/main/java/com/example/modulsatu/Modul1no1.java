package com.example.modulsatu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.modulsatu.R.layout.tampilanno1;

public class Modul1no1 extends AppCompatActivity {
    EditText namaku;
    TextView print;
    Button buttonNo1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(tampilanno1);


        namaku = findViewById(R.id.nama);
        print = findViewById(R.id.print);
        buttonNo1 = findViewById(R.id.buttonNo1);
    }

    public void klikbuttonNo1(View view){
        String nama = namaku.getText().toString();
        print.setText(nama);
    }
}
