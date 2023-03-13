package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ArdBia extends AppCompatActivity {

    // Declare components
    ImageButton callButtonArdBiaJ, websiteButtonArdBiaJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ard_bia);

        // Linking buttons to their ids
        callButtonArdBiaJ = findViewById(R.id.callButtonArdBia);
        websiteButtonArdBiaJ = findViewById(R.id.websiteButtonArdBia);

        // Opening dial pad
        callButtonArdBiaJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 561 114"));
                startActivity(intent);
            }
        });

        // Opening their website
        websiteButtonArdBiaJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.ardbia.com/");
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