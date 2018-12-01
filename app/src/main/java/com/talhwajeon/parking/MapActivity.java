package com.talhwajeon.parking;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity /*implements OnMapReadyCallback*/ {
    GoogleMap map;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

/*
        LocationManager locationManager =
                (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        LocationProvider provider =
                locationManager.getProvider(LocationManager.GPS_PROVIDER);
*/

/*        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);*/
    }
/*
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        int num_park = 3;

        LatLng current_loc = new LatLng(37.52487, 126.92723);

        for(int i=0; i<num_park; i++){
            MarkerOptions markerOpt = new MarkerOptions();
            markerOpt
                    .position(new LatLng(current_loc.latitude+i, current_loc.latitude));


            map.addMarker(markerOpt);
        }


        googleMap.moveCamera(CameraUpdateFactory.newLatLng(current_loc));
    }*/

/*    private final LocationListener mLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            LatLng  latLng = new LatLng(location.getLatitude(), location.getLongitude());
            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(latLng).zoom(14).build();

            map.animateCamera(CameraUpdateFactory
                    .newCameraPosition(cameraPosition));
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };*/

   /* public LatLng getLocation() {
        LatLng current_loc;

        if (mLocationManager != null) {

            isGPSEnable = mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            isNetworkEnable = mLocationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            Log.e(TAG, "isGPSEnable : " + isGPSEnable);
            Log.e(TAG, "isNetworkEnable : " + isNetworkEnable);

            locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    double lat = location.getLatitude();
                    double lng = location.getLongitude();

                    Toast.makeText(mContext, "위도 : " + lat + " 경도 : " + lng, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                    Log.e(TAG, "onStatusChanged : ");
                }

                @Override
                public void onProviderEnabled(String provider) {
                    Log.e(TAG, "onProviderEnabled : ");
                }

            }
        }
        return current_loc;
    }*/

/*    @Override
    protected void onStart() {
        super.onStart();

        LocationManager locationManager =
                (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        final boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if (!gpsEnabled) {

            enableLocationSettings();
        }
    }


    private void enableLocationSettings() {
        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
    }*/
}
