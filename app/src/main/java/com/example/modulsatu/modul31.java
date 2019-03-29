package com.example.modulsatu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class modul31 extends AppCompatActivity{
    Double total;
    String pemesan;
    TextView total2,kembalian2;
    EditText bayar2;
    double bayari,kembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanmodul31);
        total2 = findViewById(R.id.total2);
        kembalian2 = findViewById(R.id.kembalian2);
        bayar2 = findViewById(R.id.bayar2);

        Bundle a = getIntent().getExtras();
        total = a.getDouble("totalbayar");
        pemesan = a.getString("pemesan");
        total2.setText(Double.toString(total));

    }
    public void bayar(View view) {
        bayari = Double.parseDouble(bayar2.getText().toString());
        kembalian = bayari-total;
        kembalian2.setText(Double.toString(kembalian));
        if (bayari<total){
            Toast.makeText(this,pemesan +" Mohon Maaf Uang anda kurang Rp. " + (kembalian*-1), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Terima Kasih,"+pemesan+" Transaksi berhasil. Kembalian Rp. " +kembalian, Toast.LENGTH_LONG).show();
        }


    }



}


