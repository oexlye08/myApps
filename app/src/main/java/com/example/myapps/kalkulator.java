package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {
    EditText nilai1, nilai2;
    Button plus, min, kali, bagi, clear;
    TextView hasil;
    double angka1, angka2, jadi;
    String sAngka1,sAngka2; /**untuk mendapatkan nilai dari edit text itu pastinya pertama dalam bentuk string, maka dari itu kita ubah ke double**/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        nilai1=findViewById(R.id.nilai1);
        nilai2=findViewById(R.id.nilai2);
        plus=findViewById(R.id.plus);
        min=findViewById(R.id.min);
        kali=findViewById(R.id.kali);
        bagi=findViewById(R.id.bagi);
        clear=findViewById(R.id.clear);
        hasil=findViewById(R.id.hasil);


        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double angka1=Double.parseDouble(nilai1.getText().toString());
                        double angka2=Double.parseDouble(nilai2.getText().toString());
                        jadi = angka1+angka2;
                        hasil.setText(Double.toString(jadi));
                    }
                }
        );
        min.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sAngka1=nilai1.getText().toString();
                        angka1=Double.parseDouble(sAngka1);
                        angka2=Double.parseDouble(nilai2.getText().toString());
                        jadi = angka1-angka2;
                        hasil.setText(angka1+ "-"+angka2 +"="+jadi);

                    }
                }
        );
        kali.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sAngka1=nilai1.getText().toString();
                        angka1=Double.parseDouble(sAngka1);
                        angka2=Double.parseDouble(nilai2.getText().toString());
                        jadi = angka1*angka2;
                        hasil.setText(angka1+ "x"+angka2 +"="+jadi);

                    }
                }
        );
        bagi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sAngka1=nilai1.getText().toString();
                        angka1=Double.parseDouble(sAngka1);
                        angka2=Double.parseDouble(nilai2.getText().toString());
                        jadi = angka1/angka2;
                        hasil.setText(angka1+ ":"+angka2 +"="+jadi);

                    }
                }
        );
        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }
        );
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai1.setText("");
                hasil.setText("");

                nilai2.getText().clear();

            }
        });



    }
}
