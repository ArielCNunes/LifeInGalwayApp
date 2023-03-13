package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IMC extends AppCompatActivity {

    // Declare components
    ImageButton callButtonIMCJ;
    Button kidsClubIMCButtonJ, imcBuyTicketButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        // Link buttons to their ids
        callButtonIMCJ = findViewById(R.id.callButtonIMC);
        kidsClubIMCButtonJ = findViewById(R.id.kidsClubIMCButton);
        imcBuyTicketButtonJ = findViewById(R.id.imcBuyTicketButton);

        // Opening dial pad
        callButtonIMCJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 566 771"));
                startActivity(intent);
            }
        });

        // Opening webpage about kids' club
        kidsClubIMCButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://imccinemas.ie/kids-club/Galway/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening webpage to buy tickets
        imcBuyTicketButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://imccinemas.ie/film-times/galway/today/");
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