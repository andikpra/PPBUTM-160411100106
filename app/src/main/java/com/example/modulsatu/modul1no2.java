package com.example.modulsatu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class modul1no2 extends AppCompatActivity {

    TextView tampil;
    EditText edit1, edit2;
    double view1,view2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanno2);
        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);
        tampil = findViewById(R.id.hasilnya);
    }
    public void convert(){
        view1 = Double.parseDouble(edit1.getText().toString());
        view2 = Double.parseDouble(edit2.getText().toString());
    }

    public void hitung(View view) {
        convert();
        hasil=view1/((view2/100)*(view2/100));
        if (hasil < 18.5){
            tampil.setText(Double.toString(hasil)+" Underweight");
        }
        else if (hasil >= 18.5 && hasil <= 24.9){
            tampil.setText(Double.toString(hasil)+" Normal Weight");
        }
        else if (hasil >= 25 && hasil <= 29.9){
            tampil.setText(Double.toString(hasil)+" Over weight");
        }
        else if (hasil >= 30 && hasil <= 34.9){
            tampil.setText(Double.toString(hasil)+" Obesity 1");
        }
        else if (hasil >= 35 && hasil <= 39.9){
            tampil.setText(Double.toString(hasil) + " Obesity 2");
        }
        else{
            tampil.setText(Double.toString(hasil)+ " Obesity 3");
        }
    }
}
