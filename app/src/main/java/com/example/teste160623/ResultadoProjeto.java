package com.example.teste160623;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoProjeto extends Projeto {
    Button btncalcular;
    Button btnvoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desiresposta);

         btncalcular = findViewById(R.id.btncalcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in;
                in = new Intent(ResultadoProjeto.this, Projeto.class);
//in.putExtra…
                startActivity(in);

            }
        });
        Intent it = getIntent();
        String nome=it.getStringExtra("nome");
        double valorppro = it.getDoubleExtra("btnvoltar", 0);
        TextView tv = findViewById(R.id.textView);
        tv.setText(nome+" "+valorppro);
    }


    public void voltar(View v) {
        this.finish();

    }
}






