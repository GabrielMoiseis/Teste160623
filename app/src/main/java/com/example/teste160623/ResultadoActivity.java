package com.example.teste160623;



import static java.lang.Float.valueOf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView txtResultado;
    Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_calculadora);

        txtResultado = findViewById(R.id.txtResultado);
        btnVoltar = findViewById(R.id.btnvoltar);

        Bundle bundle = getIntent().getExtras();
        float valor1 = bundle.getFloat("valor1");
        float valor2 = bundle.getFloat("valor2");

        Intent it = getIntent();
        Float resultado = valueOf(it.getStringExtra("resultado"));
        Resultado.setText(String.valueOf(resultado));


        btnVoltarVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent it = new Intent(ResultadoActivity.this, CalculadoraActivity.class);
                it.putExtra("Num01",valor1);
                it.putExtra("Num02",valor2);

                startActivity(it);
            }
        });

    }
}
