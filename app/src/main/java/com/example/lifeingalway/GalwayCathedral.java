package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GalwayCathedral extends AppCompatActivity {

    // Declare components
    Button aboutGalwayCathedralButtonJ, morePicsGalwayCathedralButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galway_cathedral);

        // Linking buttons to their ids
        aboutGalwayCathedralButtonJ = findViewById(R.id.aboutGalwayMuseumButton);
        morePicsGalwayCathedralButtonJ = findViewById(R.id.morePicsGalwayMuseumButton);

        // Opening webpage with info on Galway Cathedral
        aboutGalwayCathedralButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://thisisgalway.ie/the-history-of-galway-cathedral/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening webpage with more pictures
        morePicsGalwayCathedralButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.istockphoto.com/search/2/image?phrase=galway+cathedral");
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