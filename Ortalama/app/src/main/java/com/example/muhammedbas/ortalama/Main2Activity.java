package com.example.muhammedbas.ortalama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    int n1a,n2a,n3a,n4a;
    TextView sonuc1;
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    Button hesap;
    EditText k1a;
    EditText k2a;
    EditText k3a;
    EditText k4a;
    double sonuc;
    Button temizle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent i = getIntent();
        String s =i.getStringExtra("mesaj");
        temizle=(Button)findViewById(R.id.btn_temizle);
       ed1 = (EditText) findViewById(R.id.et_birinciSayi);
       ed2=(EditText) findViewById(R.id.et_ikinciSayi);
        ed3=(EditText) findViewById(R.id.et_3);
        ed4=(EditText) findViewById(R.id.et_4);
        k1a = (EditText) findViewById(R.id.k1);
        k2a = (EditText) findViewById(R.id.k2);
        k3a = (EditText) findViewById(R.id.k3);
        k4a = (EditText) findViewById(R.id.k4);

        sonuc1 =(TextView) findViewById(R.id.tv_sonuc);

        hesap =(Button) findViewById(R.id.btn_ort);


        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().trim().equals("")
                        ||ed2.getText().toString().trim().equals("")||ed3.getText().toString().trim().equals("")||
                        ed4.getText().toString().trim().equals(""))
                {
                    sonuc1.setText("Hepsini doldur ..");
                }
else {

                    double sayibir = Double.parseDouble(ed1.getText().toString());
                    double sayiiki = Double.parseDouble(ed2.getText().toString());
                    double sayiüc = Double.parseDouble(ed3.getText().toString());
                    double sayidört = Double.parseDouble(ed4.getText().toString());

                    double kat1 = Double.valueOf(k1a.getText().toString());
                    double kat2 = Double.valueOf(k2a.getText().toString());
                    double kat3 = Double.valueOf(k3a.getText().toString());
                    double kat4 = Double.valueOf(k4a.getText().toString());

                    sonuc = (sayibir * kat1) + (sayiiki * kat2) + (sayiüc * kat3) + (sayidört * kat4);

                    sonuc1.setText(String.valueOf(sonuc));
                }

            }
        });




        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                k1a.setText("");
                k2a.setText("");
                k3a.setText("");
                k4a.setText("");
                sonuc1.setText("");
            }
        });






    }
}
