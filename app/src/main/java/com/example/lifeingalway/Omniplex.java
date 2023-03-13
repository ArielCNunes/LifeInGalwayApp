package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Omniplex extends AppCompatActivity {

    // Declare components
    ImageButton callButtonOmniplexJ;
    Button aboutOmniplexButtonJ, omniplexBuyTicketButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omniplex);

        // Link components to their ids
        callButtonOmniplexJ = findViewById(R.id.callButtonOmniplex);
        aboutOmniplexButtonJ = findViewById(R.id.aboutOmniplexButton);
        omniplexBuyTicketButtonJ = findViewById(R.id.omniplexBuyTicketButton);

        // Open dial pad
        callButtonOmniplexJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 456 446"));
                startActivity(intent);
            }
        });

        // Open about webpage
        aboutOmniplexButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.omniplex.ie/company");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Buy tickets webpage
        omniplexBuyTicketButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.omniplex.ie/WhatsOn/");
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