package com.example.activitymarker;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        // Add a marker in Sydney and move the camera
        LatLng Urdaneta = new LatLng(15.975012, 120.580932);
        mMap.addMarker(new MarkerOptions().position(Urdaneta).title("Marker in Badipa National High School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Urdaneta));

        LatLng Tayug = new LatLng(16.025485, 120.748317);
        mMap.addMarker(new MarkerOptions().position(Tayug).title("Marker in Tayug National High School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Tayug));

        LatLng Manaoag = new LatLng(16.046860, 120.486658);
        mMap.addMarker(new MarkerOptions().position(Manaoag).title("Marker in Manaoag National High School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manaoag));
    }
}