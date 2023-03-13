package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AranIslands extends AppCompatActivity {

    // Declare components
    Button thingsToDoAranIslandsButtonJ, morePicsAranIslandsButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aran_island);

        // Linking buttons to their ids
        thingsToDoAranIslandsButtonJ = findViewById(R.id.thingsToDoAranIslandsButton);
        morePicsAranIslandsButtonJ = findViewById(R.id.morePicsAranIslandsButton);

        // Opening webpage
        thingsToDoAranIslandsButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.theirishroadtrip.com/the-aran-islands/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening webpage with images from the Aran Islands
        morePicsAranIslandsButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.istockphoto.com/photos/aran-islands");
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