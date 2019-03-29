package com.example.modulsatu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


public class modul2 extends AppCompatActivity {

    EditText pemesan, jumlah1, jumlah2, jumlah3;
    int a,b,c;
    CheckBox Arabica, Robusta, American ;
    RadioButton panas1, dingin1, panas2, dingin2, panas3, dingin3;
    Button cek;
    Double Ar, Ro, Am, total;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul2);
        pemesan= findViewById(R.id.pemesan);
        jumlah1= findViewById(R.id.jumlah1);
        jumlah2= findViewById(R.id.jumlah2);
        jumlah3= findViewById(R.id.jumlah3);


        Arabica= findViewById(R.id.Arabica);
        Robusta= findViewById(R.id.Robusta);
        American= findViewById(R.id.American);

        panas1= findViewById(R.id.panas1);
        panas2= findViewById(R.id.panas2);
        panas3= findViewById(R.id.panas3);
        dingin1= findViewById(R.id.dingin1);
        dingin2=findViewById(R.id.dingin2);
        dingin3=findViewById(R.id.dingin3);

        cek=findViewById(R.id.cek);

    }


    public void cek(View view) {
        Ar=0.0; Ro=0.0; Am=0.0; total=0.0;

        if (Arabica.isChecked()){
            Ar=Double.parseDouble(jumlah1.getText().toString())*5000;
            if (panas1.isChecked()){
                Ar=Double.parseDouble(jumlah1.getText().toString())*5000+1000;
            }
            else if(dingin1.isChecked()){
                Ar=Double.parseDouble(jumlah1.getText().toString())*5000+2000;
            }
        }
        if (Robusta.isChecked()){
            Ro=Double.parseDouble(jumlah2.getText().toString())*6000;
            if (panas2.isChecked()){
                Ro=Double.parseDouble(jumlah2.getText().toString())*6000+1000;
            }
            else if (dingin2.isChecked()){
                Ro=Double.parseDouble(jumlah2.getText().toString())*6000+2000;
            }
        }
        if (American.isChecked()){
            Am=Double.parseDouble(jumlah3.getText().toString())*7000;
            if (panas3.isChecked()){
                Am=Double.parseDouble(jumlah3.getText().toString())*7000+1000;
            }
            else if (dingin3.isChecked()){
                Am=Double.parseDouble(jumlah3.getText().toString())*7000+2000;
            }
        }
        total=Ar+Ro+Am;
        Intent modul31 = new Intent(this, modul31.class);
        Bundle B = new Bundle();
        B.putString("pemesan", pemesan.toString());
        B.putDouble("totalbayar",total);
        modul31.putExtras(B);
        startActivity(modul31);


    }


    public void inc1(View view){
        a = Integer.valueOf(jumlah1.getText().toString()) + 1;
        jumlah1.setText(Integer.toString(a));
    }
    public void inc2(View view){
        b = Integer.valueOf(jumlah2.getText().toString()) + 1;
        jumlah2.setText(Integer.toString(b));
    }public void inc3(View view){
        c = Integer.valueOf(jumlah3.getText().toString()) + 1;
        jumlah3.setText(Integer.toString(c));
    }

    public void dec1(View view){
        a = Integer.valueOf(jumlah1.getText().toString()) - 1;
        jumlah1.setText(Integer.toString(a));
    }
    public void dec2(View view){
        b = Integer.valueOf(jumlah2.getText().toString()) - 1;
        jumlah2.setText(Integer.toString(b));
    }public void dec3(View view){
        c = Integer.valueOf(jumlah3.getText().toString()) - 1;
        jumlah3.setText(Integer.toString(c));
    }




}
