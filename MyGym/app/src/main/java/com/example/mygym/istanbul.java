package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class istanbul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istanbul);

        String []ilceler = {"Adalar","Arnavutköy","Ataşehir","Avcılar","Bağcılar","Bahçelievler","Bakırköy","Başakşehir","Bayrampaşa","Beşiktaş"
                ,"Beykoz","Beylikdüzü","Beyoğlu","Büyükçekmece","Çatalca","Çekmeköy","Esenler","Esenyurt","Eyüpsultan","Fatih","Gaziosmanpaşa","Güngören"
                ,"Kadıköy","Kağıthane","Kartal","Küçükçekmece","Maltepe","Pendik","Sancaktepe","Sarıyer","Silivri","Sultanbeyli","Sultangazi","Şile"
                ,"Şişli","Tuzla","Ümraniye","Üsküdar","Zeytiburnu"};
        ListView listView = (ListView) findViewById(R.id.listview);

        ListAdapter myadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ilceler);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 3)
                {
                    Intent intent = new Intent(istanbul.this,avcilar.class);
                    startActivity(intent);
                }

                if (position == 12)
                {
                    Intent intent = new Intent(istanbul.this,beyoglu.class);
                    startActivity(intent);
                }

                if (position == 21)
                {
                    Intent intent = new Intent(istanbul.this,gungoren.class);
                    startActivity(intent);
                }

            }
        });
    }
}
