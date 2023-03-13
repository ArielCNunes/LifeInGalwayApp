package com.example.lifeingalway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaring components
    Button eyreSquareButtonJ, aranIslandsButtonJ, galwayCathedralButton, galwayMuseumButtonJ,
            anPucanButtonJ, johnKeoghsButtonJ, mcSwigganButtonJ, ardBiaButtonJ,
            omniplexButtonJ, eyeButtonJ, IMCButtonJ, palasButtonJ,
            salthillButtonJ, dogsBayButtonJ, silverstrandButtonJ, renvyleButton,
            EmergencyNumbersButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

////////////////////////////////////////////////////////////////////////////////////////////////////

        // Linking buttons
        // PLACES TO SEE
        eyreSquareButtonJ = findViewById(R.id.eyreSquareButton);
        aranIslandsButtonJ = findViewById(R.id.aranIslandsButton);
        galwayCathedralButton = findViewById(R.id.galwayCathedralButton);
        galwayMuseumButtonJ = findViewById(R.id.galwayMuseumButton);

        // PUBS & RESTAURANTS
        anPucanButtonJ = findViewById(R.id.anPucanButton);
        johnKeoghsButtonJ = findViewById(R.id.johnKeoghsButton);
        mcSwigganButtonJ = findViewById(R.id.mcSwigganButton);
        ardBiaButtonJ = findViewById(R.id.ardBiaButton);

        // CINEMAS
        omniplexButtonJ = findViewById(R.id.omniplexButton);
        eyeButtonJ = findViewById(R.id.eyeButton);
        IMCButtonJ = findViewById(R.id.IMCButton);
        palasButtonJ = findViewById(R.id.palasButton);

        // BEACHES
        salthillButtonJ = findViewById(R.id.salthillButton);
        dogsBayButtonJ = findViewById(R.id.dogsBayButton);
        silverstrandButtonJ = findViewById(R.id.silverstrandButton);
        renvyleButton = findViewById(R.id.renvyleButton);

        // MORE ABOUT GALWAY
        EmergencyNumbersButtonJ = findViewById(R.id.EmergencyNumbersButton);

////////////////////////////////////////////////////////////////////////////////////////////////////

        // PLACES TO SEE
        // Eyre Square activity
        eyreSquareButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EyreSquare.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Aran Islands activity
        aranIslandsButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AranIslands.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Galway Cathedral activity
        galwayCathedralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalwayCathedral.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Galway City Museum activity
        galwayMuseumButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalwayMuseum.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////

        // PUBS & RESTAURANTS
        // An Púcán Pub
        anPucanButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AnPucan.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // John Keogh’s Gastropub
        johnKeoghsButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, JohnKeoghs.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // McSwiggan’s
        mcSwigganButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, McSwiggans.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Ard Bia at Nimmos
        ardBiaButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ArdBia.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////

        // CINEMAS
        // Omniplex cinema
        omniplexButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Omniplex.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Eye cinema
        eyeButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Eye.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // IMC cinema
        IMCButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IMC.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Pálás cinema
        palasButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Palas.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////

        // BEACHES
        // Salthill
        salthillButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Salthill.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Dog's Bay
        dogsBayButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DogsBay.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Silverstrand
        silverstrandButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Silverstrand.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

        // Renvyle
        renvyleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Renvyle.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////

        // MORE
        // EMERGENCY NUMBERS
        EmergencyNumbersButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, emergencyNumbers.class));
                // Transition
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation);
            }
        });

    }
}