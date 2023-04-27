package com.example.teste160623;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acerto extends AppCompatActivity {

    Button btnvoltarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaacerto);

        btnvoltarm = findViewById(R.id.btnvoltarm);

        btnvoltarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Acerto.this, Jogomemoria.class);
                startActivity(it);            }
        });
    }
}
