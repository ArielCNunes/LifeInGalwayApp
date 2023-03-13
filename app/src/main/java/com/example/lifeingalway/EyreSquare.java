package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EyreSquare extends AppCompatActivity {

    // Declare components
    Button thingsToDoEyreSquareButtonJ, morePicsEyreSquareButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyre_square);

        // Linking buttons
        thingsToDoEyreSquareButtonJ = findViewById(R.id.thingsToDoEyreSquareButton);
        morePicsEyreSquareButtonJ = findViewById(R.id.morePicsEyreSquareButton);

        // Opening a webpage with things to do inn Eyre Square
        thingsToDoEyreSquareButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.galwaytourism.ie/eyre-square/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        morePicsEyreSquareButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/jfkparkgalway/photos/");
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