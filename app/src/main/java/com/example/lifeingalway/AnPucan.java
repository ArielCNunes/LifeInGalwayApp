package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AnPucan extends AppCompatActivity {

    // Declare components
    ImageButton callButtonAnPucanJ, websiteButtonAnPucanJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an_pucan);

        // Linking buttons to their ids
        callButtonAnPucanJ = findViewById(R.id.callButtonAnPucan);
        websiteButtonAnPucanJ = findViewById(R.id.websiteButtonAnPucan);

        // Opening dial pad with An Púcán's number
        callButtonAnPucanJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 376 561"));
                startActivity(intent);
            }
        });

        // Opening webpage to An Púcán's website
        websiteButtonAnPucanJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://anpucan.ie/");
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