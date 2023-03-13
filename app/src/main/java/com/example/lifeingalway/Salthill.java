package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Salthill extends AppCompatActivity {

    // Declare components
    ImageButton directionsSalthillJ;
    Button aboutSalthillJ, videoSalthillJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salthill);

        // Linking buttons to their ids
        directionsSalthillJ = findViewById(R.id.directionsSalthill);
        aboutSalthillJ = findViewById(R.id.aboutSalthill);
        videoSalthillJ = findViewById(R.id.videoSalthill);

        // Opening webpage with the GPS
        directionsSalthillJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir//Salthill,+Co.+Galway/data=!4m7!4m6!1m1!4e2!1m2!1m1!1s0x485b97acebd7cdef:0x2600c7a819ba6d32!3e0?sa=X&ved=2ahUKEwjW9qiW0oH2AhXxmFwKHUJ4AFAQox16BAgbEBI");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening about webpage
        aboutSalthillJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.discoverireland.ie/galway/salthill-beach");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening video of Salthill
        videoSalthillJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=uxgwz6LS9Ps");
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