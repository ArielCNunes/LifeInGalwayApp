package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Eye extends AppCompatActivity {

    // Declare components
    ImageButton callButtonEyeJ;
    Button kidsBirthdayPartyEyeButton, eyeBuyTicketButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye);

        // Link buttons to their ids
        callButtonEyeJ = findViewById(R.id.callButtonEye);
        kidsBirthdayPartyEyeButton = findViewById(R.id.kidsBirthdayPartyEyeEyeButton);
        eyeBuyTicketButtonJ = findViewById(R.id.eyeBuyTicketButton);

        // Open dial pad
        callButtonEyeJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 780 078"));
                startActivity(intent);
            }
        });

        // Opening kids birthday party webpage
        kidsBirthdayPartyEyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.eyecinema.ie/information/birthday-parties");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Open page with films showing
        eyeBuyTicketButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.eyecinema.ie/");
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