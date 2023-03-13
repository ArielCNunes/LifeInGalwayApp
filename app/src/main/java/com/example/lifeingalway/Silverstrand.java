package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Silverstrand extends AppCompatActivity {

    // Declare components
    ImageButton directionsSilverstrandJ;
    Button aboutSilverstrandJ, videoSilverstrandJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silverstrand);

        // Linking components to their ids
        directionsSilverstrandJ = findViewById(R.id.directionsSilverstrand);
        aboutSilverstrandJ = findViewById(R.id.aboutSilverstrand);
        videoSilverstrandJ = findViewById(R.id.videoSilverstrand);

        // Opening GPS
        directionsSilverstrandJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//silver+strand+beach+galway/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x485bbd7bf7d3d33b:0x759617cd11111101?sa=X&hl=en&ved=2ahUKEwi18OiL6IT2AhUOQkEAHSZEBksQ9Rd6BAg_EAQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening about webpage
        aboutSilverstrandJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.thebeachguide.co.uk/republic-of-ireland/county-galway/silverstrand.htm");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening YT video
        videoSilverstrandJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=n4r-hMgrczY");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

    // Transition going back
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.static_animation, R.anim.zoom_out);
    }

}