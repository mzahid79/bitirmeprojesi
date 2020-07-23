package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class beyoglu extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    static final LatLng beyoglu = new LatLng(41.038528, 28.976813);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beyoglu);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }
    public void onMapReady(GoogleMap googleMap){

        mMap = googleMap;


        LatLng demka = new LatLng(40.987669, 29.095341);
        googleMap.addMarker(new MarkerOptions().position(demka).title("Demka Okçuluk Ataşehir"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(demka));

        LatLng ibbbeyoglu = new LatLng(41.033095, 28.970921);
        googleMap.addMarker(new MarkerOptions().position(ibbbeyoglu).title("İBB Beyoğlu Spor Kompleksi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ibbbeyoglu));

        LatLng flashgym = new LatLng(41.033592, 28.976659);
        googleMap.addMarker(new MarkerOptions().position(flashgym).title("Flash Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(flashgym));

        LatLng fitintime = new LatLng(41.028745, 28.973240);
        googleMap.addMarker(new MarkerOptions().position(fitintime).title("fitintime"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(fitintime));

        LatLng cihangirsports = new LatLng(41.031692, 28.982698);
        googleMap.addMarker(new MarkerOptions().position(cihangirsports).title("Cihangir Sports Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(cihangirsports));

        LatLng noagym = new LatLng(41.026369, 28.976141);
        googleMap.addMarker(new MarkerOptions().position(noagym).title("Noa Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(noagym));

        LatLng spoium = new LatLng(41.035191, 28.968928);
        googleMap.addMarker(new MarkerOptions().position(spoium).title("Spoıum Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(spoium));

        LatLng bfit = new LatLng(41.034163, 28.986721);
        googleMap.addMarker(new MarkerOptions().position(bfit).title("B-fit Cihangir Kadınların Spor ve Yaşam Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bfit));

        LatLng proplus = new LatLng(41.043728, 28.952160);
        googleMap.addMarker(new MarkerOptions().position(proplus).title("Proplus Fitness Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(proplus));

        LatLng beyogluspor = new LatLng(41.034654, 28.982590);
        googleMap.addMarker(new MarkerOptions().position(beyogluspor).title("Beyoğlu Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(beyogluspor));




        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(beyoglu,15));

    }

}
