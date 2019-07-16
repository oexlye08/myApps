package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNama;
    Button itung, ke_list;
    TextView textNama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNama=findViewById(R.id.textNama);
        editNama=findViewById(R.id.editNama);
        ke_list=findViewById(R.id.ke_list);

        final Context context=this;
        ke_list.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, ListViewActivity.class);
                        startActivity(intent);
                    }
                }
        );

        itung=findViewById(R.id.itung);
        itung.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent =new Intent(context, kalkulator.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void TampilNama(View view) {
        textNama.setText("Nama Anda :" +
                editNama.getText().toString());
    }

}
