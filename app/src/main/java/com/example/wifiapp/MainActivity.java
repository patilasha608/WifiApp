package com.example.wifiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnWiFiOn,btnWiFiOff;
    WifiManager wifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);

        btnWiFiOn=(Button)findViewById(R.id.btnWiFiOn);
        btnWiFiOff=(Button)findViewById(R.id.btnWiFiOff);

        btnWiFiOn.setOnClickListener(new OnClickLinear(){
            public void onClick(View v){
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "Wi-Fi turned on",Toast.LENGTH_LONG).show();
            }
        });

        btnWiFiOff.setOnClickListener(new OnClickLinear(){
            public void onClick(View v){
                wifi.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(), "Wi-Fi turned off",Toast.LENGTH_LONG).show();
            }
        });
    }
}

