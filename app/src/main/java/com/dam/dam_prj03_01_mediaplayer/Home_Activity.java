package com.dam.dam_prj03_01_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton imageBtnVideo = findViewById(R.id.imageBtnVideo);

        imageBtnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this,
                        Video_Activity.class);
                String titre = "Ma vidéo";
                intent.putExtra("TitrePage", titre);  //(Key, Value)

                startActivity(intent);
            }
        });


        //Récupération des données de l'intent
        Intent intent = getIntent();
        String titre = intent.getStringExtra("TitrePage");
        setTitle(titre);

    }
}