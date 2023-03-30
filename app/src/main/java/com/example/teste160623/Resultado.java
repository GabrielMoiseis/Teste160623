package com.example.teste160623;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultado extends CalculadoraSimples {
     Button buttonirresultado;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            View buttonIrResultado = findViewById(R.id.buttonirresultado);

            View buttonirresultado = null;
            buttonirresultado.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in;
                    in = new Intent(CalculadoraSimples.this, Resultado.class);
//in.putExtra…
                    startActivity(in);
                }
            });
        }



}
