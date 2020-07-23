package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtYazi;
    private ImageView imgGorsel;
    private static int GECIS_SURESI = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtYazi = (TextView)findViewById(R.id.txtYazi);
        imgGorsel = (ImageView)findViewById(R.id.imgGorsel);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        txtYazi.startAnimation(animation);
        imgGorsel.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(gecis);
                finish();
            }
        },GECIS_SURESI);


    }
}
