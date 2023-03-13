package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GalwayMuseum extends AppCompatActivity {

    // Declare components
    Button aboutGalwayMuseumButtonJ, morePicsGalwayMuseumButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galway_museum);

        // Linking buttons to their ids
        aboutGalwayMuseumButtonJ = findViewById(R.id.aboutGalwayMuseumButton);
        morePicsGalwayMuseumButtonJ = findViewById(R.id.morePicsGalwayMuseumButton);

        // Opening webpage with info on Galway Museum
        aboutGalwayMuseumButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.galwaycitymuseum.ie/?locale=en");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening webpage with more pictures
        morePicsGalwayMuseumButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.shutterstock.com/search/galway+city+museum");
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