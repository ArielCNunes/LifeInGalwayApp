package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class McSwiggans extends AppCompatActivity {

    // Declaring components
    ImageButton callButtonMcSwiggansJ, websiteButtonMcSwiggansJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_swiggans);

        // Linking buttons to their ids
        callButtonMcSwiggansJ = findViewById(R.id.callButtonMcSwiggans);
        websiteButtonMcSwiggansJ = findViewById(R.id.websiteButtonMcSwiggans);

        // Opening dial pad with McSwiggan's number
        callButtonMcSwiggansJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:091 568 917"));
                startActivity(intent);
            }
        });

        // Opening McSwiggan's website
        websiteButtonMcSwiggansJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.mcswiggans.ie/#./home");
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