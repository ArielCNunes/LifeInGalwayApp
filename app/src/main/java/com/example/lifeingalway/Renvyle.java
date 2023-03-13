package com.example.lifeingalway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Renvyle extends AppCompatActivity {

    // Declare components
    ImageButton directionsRenvyleJ;
    Button aboutRenvyleJ, videoRenvyleJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renvyle);

        // Linking components to their ids
        directionsRenvyleJ = findViewById(R.id.directionsRenvyle);
        aboutRenvyleJ = findViewById(R.id.aboutRenvyle);
        videoRenvyleJ = findViewById(R.id.videoRenvyle);

        // Opening GPS
        directionsRenvyleJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/maps/dir/53.5060126,-8.8643787/Renvyle+Beach,+Tully+Beg,+Co.+Galway/@53.5364529,-9.9874792,9z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x485a263f47a701f3:0x7be4ff3c4059fb26!2m2!1d-9.9886784!2d53.6070408!3e0?hl=en");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening about webpage
        aboutRenvyleJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.thebeachguide.co.uk/republic-of-ireland/county-galway/renvyle.htm");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Opening YT video
        videoRenvyleJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=QpLJuNwN0AQ");
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