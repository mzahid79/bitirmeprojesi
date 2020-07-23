package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class avcilar extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    static final LatLng avcilar = new LatLng(40.985897, 28.722257);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avcilar);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

         mMap = googleMap;
        
        LatLng sporium = new LatLng(40.977639, 28.724226);
        googleMap.addMarker(new MarkerOptions().position(sporium).title("Sporium"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sporium));

        LatLng ibbkompleks = new LatLng(40.997235, 28.721442);
        googleMap.addMarker(new MarkerOptions().position(ibbkompleks).title("İBB Spor Kompleksi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ibbkompleks));

        LatLng avcilarolimpik = new LatLng(41.001733, 28.712287);
        googleMap.addMarker(new MarkerOptions().position(avcilarolimpik).title("Avcılar Olimpik Spor Tesisleri"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(avcilarolimpik));

        LatLng sefadosembayan = new LatLng(40.997870, 28.712793);
        googleMap.addMarker(new MarkerOptions().position(sefadosembayan).title("Sefa Dosem Spor Kulüpleri Bayan Özel"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sefadosembayan));

        LatLng galaxy = new LatLng(40.974690, 28.715036);
        googleMap.addMarker(new MarkerOptions().position(galaxy).title("Galaxy Sports Center"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(galaxy));

        LatLng miestilo = new LatLng(40.991290, 28.714924);
        googleMap.addMarker(new MarkerOptions().position(miestilo).title("Mi Estilo Fitness Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(miestilo));

        LatLng realsampiyon = new LatLng(40.982495, 28.720777);
        googleMap.addMarker(new MarkerOptions().position(realsampiyon).title("Real Şampiyon"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(realsampiyon));

        LatLng bfit = new LatLng(40.980990, 28.725800);
        googleMap.addMarker(new MarkerOptions().position(bfit).title("B-fit Avcılar"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bfit));

        LatLng gurelozgur = new LatLng(40.981240, 28.724649);
        googleMap.addMarker(new MarkerOptions().position(gurelozgur).title("Gürel Özgür Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gurelozgur));

        LatLng orhandogan = new LatLng(40.981920, 28.720108);
        googleMap.addMarker(new MarkerOptions().position(orhandogan).title("Orhan Doğan Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(orhandogan));

        LatLng sampiyonspor = new LatLng(40.982500, 28.720758);
        googleMap.addMarker(new MarkerOptions().position(sampiyonspor).title("Şampiyon Spor Center"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sampiyonspor));

        LatLng powerzone = new LatLng(40.982035, 28.733700);
        googleMap.addMarker(new MarkerOptions().position(powerzone).title("PowerZone Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(powerzone));

        LatLng akbulutgenclik = new LatLng(40.996026, 28.706013);
        googleMap.addMarker(new MarkerOptions().position(akbulutgenclik).title("Akbulut Gençlik Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(akbulutgenclik));

        LatLng flexgym = new LatLng(40.983618, 28.713304);
        googleMap.addMarker(new MarkerOptions().position(flexgym).title("Flex Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(flexgym));

        LatLng kamfit = new LatLng(40.989945, 28.711447);
        googleMap.addMarker(new MarkerOptions().position(kamfit).title("Kam Fit Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kamfit));

        LatLng ecespor = new LatLng(40.981979, 28.721322);
        googleMap.addMarker(new MarkerOptions().position(ecespor).title("Ece Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ecespor));

        LatLng forangels = new LatLng(40.978978, 28.715381);
        googleMap.addMarker(new MarkerOptions().position(forangels).title("For Angel's Fit Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(forangels));

        LatLng spacegym = new LatLng(40.974348, 28.717271);
        googleMap.addMarker(new MarkerOptions().position(spacegym).title("Space Gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(spacegym));

        LatLng sefadosem = new LatLng(40.999616, 28.708437);
        googleMap.addMarker(new MarkerOptions().position(sefadosem).title("Sefa Dosem Spor Kulüpleri"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sefadosem));

        LatLng tuncelspor = new LatLng(40.979039, 28.721074);
        googleMap.addMarker(new MarkerOptions().position(tuncelspor).title("Tunçel Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(tuncelspor));

        LatLng avcilarilcegenclik = new LatLng(40.981382, 28.746455);
        googleMap.addMarker(new MarkerOptions().position(avcilarilcegenclik).title("Avcılar İlçe Gençlik ve Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(avcilarilcegenclik));

        LatLng madamesport = new LatLng(40.973142, 28.716659);
        googleMap.addMarker(new MarkerOptions().position(madamesport).title("Madame Sport Club"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(madamesport));

        LatLng ibbspor = new LatLng(41.001228, 28.703814);
        googleMap.addMarker(new MarkerOptions().position(ibbspor).title("İBB Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ibbspor));

        LatLng vahyettin = new LatLng(41.004479, 28.704440);
        googleMap.addMarker(new MarkerOptions().position(vahyettin).title("Vahyettin Yıldırım Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(vahyettin));

        LatLng avcilarolimpikyuzme = new LatLng(40.996100, 28.720017);
        googleMap.addMarker(new MarkerOptions().position(avcilarolimpikyuzme).title("Avcılar Olimpik Yüzme Havuzu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(avcilarolimpikyuzme));

        LatLng livaspor = new LatLng(40.997220, 28.706385);
        googleMap.addMarker(new MarkerOptions().position(livaspor).title("Liva Spor"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(livaspor));

        LatLng avcilaratak = new LatLng(40.975884, 28.718237);
        googleMap.addMarker(new MarkerOptions().position(avcilaratak).title("Avcılar Atak Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(avcilaratak));

        LatLng zinfit = new LatLng(40.981726, 28.721089);
        googleMap.addMarker(new MarkerOptions().position(zinfit).title("Zin Fit Pilates Stüdyo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(zinfit));

        LatLng turgayatasu = new LatLng(40.987047, 28.727416);
        googleMap.addMarker(new MarkerOptions().position(turgayatasu).title("İ.Ü. Prof.Dr.Turgay Atasu Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(turgayatasu));

        LatLng haydarakin = new LatLng(40.998282, 28.703078);
        googleMap.addMarker(new MarkerOptions().position(haydarakin).title("Haydar Akın Spor Salonu"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(haydarakin));

        LatLng altınbilek = new LatLng(40.994433, 28.706656);
        googleMap.addMarker(new MarkerOptions().position(altınbilek).title("Avcılar Yüzme Kursu-Altınbilek Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(altınbilek));

        LatLng avcilargenclik = new LatLng(40.981377, 28.746476);
        googleMap.addMarker(new MarkerOptions().position(avcilargenclik).title("Avcılar Gençlik Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(avcilargenclik));

        LatLng ikizgym = new LatLng(41.005854, 28.709136);
        googleMap.addMarker(new MarkerOptions().position(ikizgym).title("ikiz.efsane.gym"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ikizgym));

        LatLng akbulutspor = new LatLng(40.995864, 28.706013);
        googleMap.addMarker(new MarkerOptions().position(akbulutspor).title("Akbulut Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(akbulutspor));

        LatLng atiksosyal = new LatLng(40.995629, 28.710565);
        googleMap.addMarker(new MarkerOptions().position(atiksosyal).title("Atik Sosyal Gelişim Gençlik Ve Spor Kulübü"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(atiksosyal));

        LatLng pilatesislife = new LatLng(40.981706, 28.719175);
        googleMap.addMarker(new MarkerOptions().position(pilatesislife).title("Pilates Is Life Studio"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pilatesislife));

        LatLng studyorose = new LatLng(40.982024, 28.718297);
        googleMap.addMarker(new MarkerOptions().position(studyorose).title("Stüdyo Rose Pilates Dans Mix"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(studyorose));

        LatLng gumuspalaspor = new LatLng(40.978229, 28.739717);
        googleMap.addMarker(new MarkerOptions().position(gumuspalaspor).title("Gümüşpala Spor Merkezi"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gumuspalaspor));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(avcilar,15));
    }
}
