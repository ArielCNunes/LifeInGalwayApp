package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Palas extends AppCompatActivity {

    // Declare components
    ImageButton callButtonPalasJ;
    Button aboutPalasButtonJ, palasBuyTicketButtonJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palas);

        // Link buttons to their ids
        callButtonPalasJ = findViewById(R.id.callButtonPalas);
        aboutPalasButtonJ = findViewById(R.id.aboutPalasButton);
        palasBuyTicketButtonJ = findViewById(R.id.palasBuyTicketButton);

        // Open dial pad
        callButtonPalasJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 394 800"));
                startActivity(intent);
            }
        });

        // Open about page
        aboutPalasButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://palas.ie/about/about-us/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Open buy tickets webpage
        palasBuyTicketButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://palas.ie/now-showing/");
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