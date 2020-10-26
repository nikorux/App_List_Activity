package com.pucmm.app_list_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent get_template_intent = getIntent();
        String templates_teams = get_template_intent
                .getStringExtra(MainActivity.templates_teams);
        TextView template_id = findViewById(R.id.plantilla_Equipo);
        template_id.setText("Equipo seleccionado:"+" "+templates_teams);


    }

}