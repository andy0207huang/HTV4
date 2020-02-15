package com.hackthevalley.hangoutIO;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import io.radar.sdk.Radar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String publishableKey ="prj_live_sk_3d67f679fb4542351d3402365d389b0c62b6b364";
        Radar.initialize(publishableKey);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
