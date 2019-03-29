package com.example.modulsatu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class modul1 extends AppCompatActivity{
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul1);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hasilbutton1();
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilbutton2();
            }
        });

    }

    private void hasilbutton1() {
        Intent modul1 = new Intent(this, Modul1no1.class);
        startActivity(modul1);
    }
    private void hasilbutton2() {
        Intent modul2 = new Intent(this, modul1no2.class);
        startActivity(modul2);
    }

}


