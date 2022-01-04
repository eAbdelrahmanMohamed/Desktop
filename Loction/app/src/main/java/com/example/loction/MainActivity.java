/*package com.example.loction;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {
    Button find;
    LocationManager loc;
    LocationListener ll;
String[] per={Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION};
   public static final int reqCode=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location) {
                Toast.makeText(MainActivity.this,
                        "longtud"+location.getLongitude()+"\n"+"latuid"+location.getLatitude(),
                        Toast.LENGTH_SHORT).show();
            }

        };
        loc = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        find = findViewById(R.id.find);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    ActivityCompat.requestPermissions(MainActivity.this,per,reqCode);
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                else{
                loc.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);
            }
        };
    });

    class MyLoctionLestner implements LocationListener {

        @Override
        public void onLocationChanged(@NonNull Location location) {
            Toast.makeText(MainActivity.this,
                    "longtud"+location.getLongitude()+"\n"+"latuid"+location.getLatitude(),
                    Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onProviderEnabled(@NonNull String provider) {
            LocationListener.super.onProviderEnabled(provider);
        }

        @Override
        public void onProviderDisabled(@NonNull String provider) {
            LocationListener.super.onProviderDisabled(provider);
        }
    }

}
    public void onRequestPermissionsResult(int requestCode, String[] per,int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, per, grantResults);
        switch (requestCode) {
            case reqCode:
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                } else {
                    loc.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);

                }

                break;
        }
    }}*/