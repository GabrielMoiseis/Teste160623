package com.example.teste160623;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Resultado extends AppCompatActivity {
    Button btnvoltar1;

    TextView tv_resultado;


        Intent it = getIntent();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.telaresultado);



            Intent it = getIntent();
            String num1 = it.getStringExtra("num1");
            String num2 = it.getStringExtra("num2");
            String resultado = it.getStringExtra("result");



            tv_resultado.setText(resultado);

            btnvoltar1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new
                            Intent(Resultado.this, CalculadoraSimples.class);
                }
            });


        }
    }