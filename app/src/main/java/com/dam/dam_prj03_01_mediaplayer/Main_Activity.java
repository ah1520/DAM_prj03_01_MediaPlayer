package com.dam.dam_prj03_01_mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMesApplications = findViewById(R.id.btnMesApplications);

        btnMesApplications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Activity.this,
                        Home_Activity.class);
                String titre = "Mon portefolio";
                intent.putExtra("TitrePage", titre);  //(Key, Value)

                startActivity(intent);
            }
        });
    }
}