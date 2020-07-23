package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class gungoren extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    static final LatLng gungoren = new LatLng(41.018930, 28.879572);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gungoren);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }

    public void onMapReady(GoogleMap googleMap){

        mMap = googleMap;

        LatLng gungorenspor = new LatLng(41.024482, 28.873336);
        googleMap.addMarker(new MarkerOptions().position(gungorenspor).title("Güngören Spor Eğitim Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gungorenspor));

        LatLng eflatun = new LatLng(41.012658, 28.866942);
        googleMap.addMarker(new MarkerOptions().position(eflatun).title("Eflatun - Bayanlara özel pilates ve spor Salonu / Güngören şubesi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(eflatun));

        LatLng nosfit = new LatLng(41.032055, 28.883953);
        googleMap.addMarker(new MarkerOptions().position(nosfit).title("Nosfit Spor Merkezi - Güngören, Esenler Fitness Spor Salonu - Spa Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(nosfit));

        LatLng slim = new LatLng(41.014355, 28.872831);
        googleMap.addMarker(new MarkerOptions().position(slim).title("Slim Fitness"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(slim));

        LatLng gungorenyeni = new LatLng(41.020073, 28.865722);
        googleMap.addMarker(new MarkerOptions().position(gungorenyeni).title("Güngören Yeni Akıncılar Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gungorenyeni));

        LatLng masist = new LatLng(41.024295, 28.871326);
        googleMap.addMarker(new MarkerOptions().position(masist).title("Masist Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(masist));

        LatLng barca = new LatLng(41.015849, 28.877865);
        googleMap.addMarker(new MarkerOptions().position(barca).title("Barça Fitness Center"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(barca));

        LatLng tozkoparan = new LatLng(41.013228, 28.894909);
        googleMap.addMarker(new MarkerOptions().position(tozkoparan).title("Tozkoparan Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(tozkoparan));

        LatLng powergym = new LatLng(41.014996, 28.876787);
        googleMap.addMarker(new MarkerOptions().position(powergym).title("PowerGym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(powergym));

        LatLng gymforlife = new LatLng(41.009560, 28.871768);
        googleMap.addMarker(new MarkerOptions().position(gymforlife).title("Gym For Life Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gymforlife));

        LatLng oxygen = new LatLng(41.005375, 28.883417);
        googleMap.addMarker(new MarkerOptions().position(oxygen).title("Oxygensports"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(oxygen));

        LatLng levent = new LatLng(41.022515, 28.868126);
        googleMap.addMarker(new MarkerOptions().position(levent).title("Levent Fitness"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(levent));

        LatLng aytan = new LatLng(41.020984, 28.873829);
        googleMap.addMarker(new MarkerOptions().position(aytan).title("Aytan Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(aytan));

        LatLng hurryinn = new LatLng(41.010808, 28.891344);
        googleMap.addMarker(new MarkerOptions().position(hurryinn).title("Hurry Inn Hotel Merter Fitness Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hurryinn));

        LatLng venus = new LatLng(41.011670, 28.887815);
        googleMap.addMarker(new MarkerOptions().position(venus).title("Venüs Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(venus));

        LatLng deportivo = new LatLng(41.038376, 28.873026);
        googleMap.addMarker(new MarkerOptions().position(deportivo).title("DEPORTİVO FİTNESS"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(deportivo));

        LatLng dastan = new LatLng(41.011855, 28.872278);
        googleMap.addMarker(new MarkerOptions().position(dastan).title("Daştan Spor Akademisi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(dastan));

        LatLng yildizteknik = new LatLng(41.027842, 28.886312);
        googleMap.addMarker(new MarkerOptions().position(yildizteknik).title("Yıldız Teknik Üniversitesi Kapalı Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(yildizteknik));

        LatLng haznedar = new LatLng(41.026636, 28.861922);
        googleMap.addMarker(new MarkerOptions().position(haznedar).title("Haznedar Çetinkaya Spor Kulübü Derneği"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(haznedar));

        LatLng haznedarspor = new LatLng(41.014420, 28.871405);
        googleMap.addMarker(new MarkerOptions().position(haznedarspor).title("Haznedar Spor Merkezi Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(haznedarspor));

        LatLng nedim = new LatLng(41.027862, 28.880410);
        googleMap.addMarker(new MarkerOptions().position(nedim).title("Nedim Kuşçu Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(nedim));

        LatLng gymcity = new LatLng(41.009482, 28.893981);
        googleMap.addMarker(new MarkerOptions().position(gymcity).title("Gym City Spor ve Yaşam Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gymcity));

        LatLng prolife = new LatLng(41.007890, 28.871126);
        googleMap.addMarker(new MarkerOptions().position(prolife).title("Pro Life Sporium"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(prolife));

        LatLng macfit = new LatLng(41.006294, 28.894079);
        googleMap.addMarker(new MarkerOptions().position(macfit).title("MACFit Merter"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(macfit));

        LatLng tozkoparankapali = new LatLng(41.013252, 28.895065);
        googleMap.addMarker(new MarkerOptions().position(tozkoparankapali).title("Tozkoparan Kapalı Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(tozkoparankapali));

        LatLng dejavu = new LatLng(41.025691, 28.872882);
        googleMap.addMarker(new MarkerOptions().position(dejavu).title("DejavuGym Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(dejavu));

        LatLng muratekmekci = new LatLng(41.020238, 28.865325);
        googleMap.addMarker(new MarkerOptions().position(muratekmekci).title("Murat Ekmekçi Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(muratekmekci));

        LatLng haznedardoruk = new LatLng(41.011632, 28.870725);
        googleMap.addMarker(new MarkerOptions().position(haznedardoruk).title("Haznedar Doruk Cimnastik"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(haznedardoruk));

        LatLng estetikspor = new LatLng(41.013899, 28.864138);
        googleMap.addMarker(new MarkerOptions().position(estetikspor).title("Estetik Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(estetikspor));

        LatLng mehmetyalcin = new LatLng(41.018251, 28.866901);
        googleMap.addMarker(new MarkerOptions().position(mehmetyalcin).title("Mehmet Yalçın Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(mehmetyalcin));

        LatLng ikbalgenclik = new LatLng(41.036781, 28.884797);
        googleMap.addMarker(new MarkerOptions().position(ikbalgenclik).title("İkbal Gençlik Kick Boks Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ikbalgenclik));

        LatLng flamingo = new LatLng(41.011152, 28.876270);
        googleMap.addMarker(new MarkerOptions().position(flamingo).title("Flamingo GYM Bahçelievler"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(flamingo));

        LatLng bebest = new LatLng(41.009908, 28.873371);
        googleMap.addMarker(new MarkerOptions().position(bebest).title("Be Best Sport Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bebest));

        LatLng viva = new LatLng(41.025790, 28.857479);
        googleMap.addMarker(new MarkerOptions().position(viva).title("viva city sports club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(viva));

        LatLng gymhaus = new LatLng(41.012248, 28.862354);
        googleMap.addMarker(new MarkerOptions().position(gymhaus).title("Gym Haus"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gymhaus));

        LatLng efor = new LatLng(40.993710, 28.841800);
        googleMap.addMarker(new MarkerOptions().position(efor).title("EFOR SPOR MERKEZİ"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(efor));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gungoren,15));
    }
}
