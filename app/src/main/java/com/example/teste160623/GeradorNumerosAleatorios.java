package com.example.teste160623;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.HashSet;

public class GeradorNumerosAleatorios extends AppCompatActivity {

    TextView txtNumeroAle;
    Button btnGerar;
    double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geradornumerico);

        btnGerar  = findViewById(R.id.btnGerar);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtNumeroAle.setText(String.valueOf(res));


            }
        });

        Random random = new Random();
        HashSet<Integer> numeros = new HashSet<Integer>();

        while (numeros.size() < 5) {
            int numero = random.nextInt(10) + 1; // gera um número aleatório entre 1 e 10
            numeros.add(numero); // adiciona o número ao conjunto, que garante que não haverá números repetidos
        }

        System.out.println("Números gerados: " + numeros);
    }
}
