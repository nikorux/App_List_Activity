package com.pucmm.app_list_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String templates_teams = "plantillas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView LV_Equipos;
        LV_Equipos = findViewById(R.id.LV_Equipos);
        final String[] plantillas = new String[]{"Real Madrid Club de Fútbol",
                "Juventus de Turín",
                "Fútbol Club Barcelona",
                "Manchester City Football Club",
                "Manchester United Football Club"};

        final ArrayAdapter<String> list_view_adapter = new ArrayAdapter<>(this, R.layout.second_activity, R.id.plantilla_Equipo, plantillas);
        LV_Equipos.setAdapter(list_view_adapter);

        LV_Equipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent templates = new Intent(MainActivity.this, SecondActivity.class);
                String current_template= ((TextView)view).getText().toString();
                templates.putExtra(templates_teams, current_template );
                startActivity(templates);

            }
        });
    }


}