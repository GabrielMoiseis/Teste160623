package com.example.teste160623;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2;
    Button btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnSoma = findViewById(R.id.btnSoma);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnDivisao = findViewById(R.id.btnDivisao);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculadoraActivity.this, ResultadoActivity.class);
                intent.putExtra("operacao", "+");
                intent.putExtra("valor1", edtValor1.getText().toString());
                intent.putExtra("valor2", edtValor2.getText().toString());
                startActivity(intent);
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculadoraActivity.this, ResultadoActivity.class);
                intent.putExtra("operacao", "-");
                intent.putExtra("valor1", edtValor1.getText().toString());
                intent.putExtra("valor2", edtValor2.getText().toString());
                startActivity(intent);
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculadoraActivity.this, ResultadoActivity.class);
                intent.putExtra("operacao", "*");
                intent.putExtra("valor1", edtValor1.getText().toString());
                intent.putExtra("valor2", edtValor2.getText().toString());
                startActivity(intent);
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculadoraActivity.this, ResultadoActivity.class);
                intent.putExtra("operacao", "/");
                intent.putExtra("valor1", edtValor1.getText().toString());
                intent.putExtra("valor2", edtValor2.getText().toString());
                startActivity(intent);
            }
        });
    }
}