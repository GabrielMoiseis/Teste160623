package com.example.teste160623;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button buttonIrCadastro;
    private BreakIterator etNome;
    private BreakIterator etEmail;
    private BreakIterator etCpf;
    private Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIrCadastro = findViewById(R.id.buttonIrCadastro);
        buttonIrCadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(MainActivity.this, Cadastro.class);
                    it.putExtra("nome", etNome.getText().toString());
                    it.putExtra("email", etEmail.getText().toString());
                    it.putExtra("cpf", etCpf.getText().toString());

                    String nome = it.getStringExtra("nome");
                    String email = it.getStringExtra("email");
                    String cpf = it.getStringExtra("cpf");



                    startActivity(in);
                }
            });
        }
    }