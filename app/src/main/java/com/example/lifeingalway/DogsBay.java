package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DogsBay extends AppCompatActivity {

    // Declare components
    ImageButton directionsDogsBayJ;
    Button aboutDogsBayJ, videoDogsBayJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_bay);

        // Linking buttons to their ids
        directionsDogsBayJ = findViewById(R.id.directionsDogsBay);
        aboutDogsBayJ = findViewById(R.id.aboutDogsBay);
        videoDogsBayJ = findViewById(R.id.videoDogsBay);

        // Opening GPS
        directionsDogsBayJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/53.5060126,-8.8643787/Dog's+Bay,+Ervallagh,+Roundstone,+Co.+Galway/@53.4098987,-9.9745682,9z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x485a39141a943d4f:0xf83845d4cdaf160d!2m2!1d-9.9617946!2d53.3788532!3e0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening about webpage
        aboutDogsBayJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.discoverireland.ie/galway/dog-s-bay-beach");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening video of Dog's Bay
        videoDogsBayJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=NejvU1wAWFA");
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