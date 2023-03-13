package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JohnKeoghs extends AppCompatActivity {

    // Declaring components
    ImageButton callButtonJohnKeoghsJ, websiteButtonJohnKeoghsJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john_keoghs);

        // Linking buttons to their ids
        callButtonJohnKeoghsJ = findViewById(R.id.callButtonJohnKeoghs);
        websiteButtonJohnKeoghsJ = findViewById(R.id.websiteButtonJohnKeoghs);

        // Opening dial pad with John Keogh's Gastropub's number
        callButtonJohnKeoghsJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 449 431"));
                startActivity(intent);
            }
        });

        // Opening John Keogh's Gastropub's website
        websiteButtonJohnKeoghsJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.johnkeoghs.ie/");
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