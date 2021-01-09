package com.example.mapactivity;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.970463, 120.577454))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(70, 150, 50, 50)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.0293173,120.7746168))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(70, 150, 50, 50)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.044210, 120.487852))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(70, 150, 50, 50)));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9806908,120.5605751))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(70, 150, 50, 50)));

        LatLng UCU = new LatLng(15.9806908,120.5605751);
        mMap.addMarker(new MarkerOptions().position(UCU).title("UCU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UCU));

        LatLng Urdaneta = new LatLng(15.970470, 120.577451);
        mMap.addMarker(new MarkerOptions().position(Urdaneta).title("Oligario"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Urdaneta));

        mMap.addPolyline(new PolylineOptions()

                .add(   new LatLng(15.970470, 120.577451),
                        new LatLng(15.970597, 120.577455),
                        new LatLng(15.970643, 120.576332),
                        new LatLng(15.970398, 120.573572),
                        new LatLng(15.970230, 120.573038),
                        new LatLng(15.969753, 120.571820),
                        new LatLng(15.972271, 120.571328),
                        new LatLng(15.974344, 120.570867),
                        new LatLng(15.975815, 120.570773),
                        new LatLng(15.975962, 120.570714),
                        new LatLng(15.979236, 120.570968),
                        new LatLng(15.978887, 120.565614),
                        new LatLng(15.981798, 120.560136),
                        new LatLng(15.981557, 120.560163),
                        new LatLng(15.980585, 120.560420),
                        new LatLng(15.9806908,120.5605751))
                .width(10)
                .color(Color.RED));

        LatLng SanNarciso = new LatLng(16.0293173,120.7746168);
        mMap.addMarker(new MarkerOptions().position(SanNarciso).title("Lagula"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanNarciso));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.0293173,120.7746168),
                        new LatLng(16.029364, 120.774973),
                        new LatLng(16.032062, 120.774640),
                        new LatLng(16.032757, 120.774568),
                        new LatLng(16.033014, 120.774529),
                        new LatLng(16.033947, 120.774365),
                        new LatLng(16.034193, 120.774356),
                        new LatLng(16.035345, 120.774088),
                        new LatLng(16.036874, 120.773875),
                        new LatLng(16.036455, 120.772348),
                        new LatLng(16.036051, 120.770897),
                        new LatLng(16.035427, 120.768620),
                        new LatLng(16.034789, 120.766195),
                        new LatLng(16.033664, 120.762156),
                        new LatLng(16.033530, 120.761786),
                        new LatLng(16.032901, 120.760238),
                        new LatLng(16.032571, 120.759409),
                        new LatLng(16.031756, 120.757253),
                        new LatLng(16.030722, 120.754748),
                        new LatLng(16.030085, 120.753128),
                        new LatLng(16.030085, 120.753128),
                        new LatLng(16.029004, 120.750349),
                        new LatLng(16.028679, 120.749499),
                        new LatLng(16.028550, 120.749032),
                        new LatLng(16.028125, 120.747254),
                        new LatLng(16.027675, 120.745618),
                        new LatLng(16.026351, 120.745903),
                        new LatLng(16.024613, 120.746686),
                        new LatLng(16.024190, 120.746911),
                        new LatLng(16.023286, 120.747400),
                        new LatLng(16.017065, 120.740433),
                        new LatLng(16.016622, 120.739950),
                        new LatLng(16.014745, 120.738083),
                        new LatLng(16.010692, 120.735304),
                        new LatLng(16.009454, 120.734660),
                        new LatLng(16.007031, 120.733426),
                        new LatLng(16.001751, 120.729263),
                        new LatLng(15.998399, 120.726570),
                        new LatLng(15.996182, 120.724714),
                        new LatLng(15.994727, 120.722923),
                        new LatLng(15.993180, 120.719683),
                        new LatLng(15.992211, 120.716497),
                        new LatLng(15.991757, 120.715177),
                        new LatLng(15.990989, 120.713877),
                        new LatLng(15.990989, 120.713866),
                        new LatLng(15.991453, 120.712621),
                        new LatLng(15.991505, 120.712106),
                        new LatLng(15.989092, 120.703909),
                        new LatLng(15.987957, 120.701248),
                        new LatLng(15.984347, 120.695465),
                        new LatLng(15.982560, 120.693893),
                        new LatLng(15.981894, 120.693569),
                        new LatLng(15.982626, 120.692606),
                        new LatLng(15.988896, 120.686811),
                        new LatLng(15.989685, 120.686326),
                        new LatLng(15.990278, 120.686141),
                        new LatLng(15.990611, 120.686095),
                        new LatLng(15.991302, 120.686159),
                        new LatLng(15.995355, 120.687264),
                        new LatLng(15.996020, 120.687272),
                        new LatLng(15.997890, 120.687338),
                        new LatLng(15.999566, 120.687333),
                        new LatLng(16.005179, 120.686760),
                        new LatLng(16.006899, 120.686443),
                        new LatLng(16.005868, 120.684622),
                        new LatLng(16.005569, 120.684002),
                        new LatLng(16.005401, 120.683390),
                        new LatLng(16.005094, 120.682210),
                        new LatLng(16.003996, 120.681376),
                        new LatLng(16.003073, 120.680295),
                        new LatLng(16.002740, 120.679716),
                        new LatLng(16.001884, 120.678496),
                        new LatLng(16.001786, 120.678067),
                        new LatLng(16.001673, 120.676468),
                        new LatLng(16.001554, 120.676079),
                        new LatLng(16.001211, 120.675387),
                        new LatLng(16.000963, 120.674633),
                        new LatLng(16.000960, 120.674142),
                        new LatLng(16.001164, 120.673187),
                        new LatLng(16.001404, 120.671985),
                        new LatLng(16.001667, 120.671564),
                        new LatLng(16.002306, 120.671020),
                        new LatLng(16.005178, 120.669856),
                        new LatLng(16.004539, 120.668184),
                        new LatLng(16.004772, 120.668085),
                        new LatLng(16.004331, 120.666875),
                        new LatLng(16.002629, 120.663042),
                        new LatLng(15.997503, 120.653516),
                        new LatLng(15.994159, 120.647467),
                        new LatLng(15.992736, 120.645066),
                        new LatLng(15.990916, 120.642181),
                        new LatLng(15.989557, 120.640385),
                        new LatLng(15.988546, 120.639039),
                        new LatLng(15.986553, 120.636263),
                        new LatLng(15.981410, 120.629117),
                        new LatLng(15.979526, 120.624265),
                        new LatLng(15.978507, 120.619890),
                        new LatLng(15.977775, 120.615443),
                        new LatLng(15.977386, 120.613244),
                        new LatLng(15.976530, 120.602030),
                        new LatLng(15.976445, 120.600359),
                        new LatLng(15.976918, 120.593774),
                        new LatLng(15.976962, 120.587809),
                        new LatLng(15.976833, 120.585419),
                        new LatLng(15.976575, 120.582091),
                        new LatLng(15.975869, 120.574949),
                        new LatLng(15.975819, 120.570774),
                        new LatLng(15.975969, 120.570710),
                        new LatLng(15.979246, 120.570970),
                        new LatLng(15.979022, 120.567971),
                        new LatLng(15.978883, 120.565688),
                        new LatLng(15.979909, 120.563639),
                        new LatLng(15.981807, 120.560136),
                        new LatLng(15.981557, 120.560163),
                        new LatLng(15.980585, 120.560420),
                        new LatLng(15.9806908,120.5605751))
                .width(10)
                .color(Color.RED));

        LatLng Manaoag = new LatLng(16.044210, 120.487852);
        mMap.addMarker(new MarkerOptions().position(Manaoag).title("De Guzman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manaoag));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.044210, 120.487852),
                        new LatLng(16.044201, 120.487900),
                        new LatLng(16.044201, 120.487900),
                        new LatLng(16.044560, 120.487876),
                        new LatLng(16.044537, 120.487362),
                        new LatLng(16.043346, 120.487529),
                        new LatLng(16.042714, 120.488178),
                        new LatLng(16.041856, 120.488800),
                        new LatLng(16.039799, 120.489838),
                        new LatLng(16.029890, 120.502745),
                        new LatLng(16.024662, 120.506205),
                        new LatLng(16.020277, 120.508123),
                        new LatLng(16.016507, 120.517236),
                        new LatLng(16.009216, 120.526967),
                        new LatLng(16.007958, 120.528737),
                        new LatLng(16.003317, 120.534767),
                        new LatLng(15.994778, 120.540550),
                        new LatLng(15.990653, 120.543704),
                        new LatLng(15.986984, 120.549117),
                        new LatLng(15.985731, 120.552282),
                        new LatLng(15.985236, 120.553666),
                        new LatLng(15.984720, 120.555324),
                        new LatLng(15.982802, 120.558296),
                        new LatLng(15.981798, 120.560136),
                        new LatLng(15.981557, 120.560163),
                        new LatLng(15.980585, 120.560420),
                        new LatLng(15.9806908,120.5605751))
                .width(10)
                .color(Color.RED));
    }
}