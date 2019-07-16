package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView listview;

    String daftar[]  = {
            "Indonesia" ,
            "Malaysia",
            "Singapore",
            "Italia",
            "Inggris",
            "Belanda",
            "Argentina",
            "Chile",
            "Mesir",
            "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview = findViewById(R.id.listview);

        final ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            data.add("Data Ke - " +i);
    }
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>( this,
                        android.R.layout.simple_list_item_1,
                        daftar);
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(ListViewActivity.this,
                                    "Memilih "+daftar[i],
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
            );
        }

    }

