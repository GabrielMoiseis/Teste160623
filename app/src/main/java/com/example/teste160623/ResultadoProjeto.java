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
        setContentView(R.layout.activity_main);

        View btncalcular = findViewById(R.id.btncalcular);

        View btncalcular = null;
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in;
                in = new Intent(Projeto.this, Resultado.class);
//in.putExtra…
                startActivity(in);

            }
        });
        Intent it = getIntert();
        String nome=it.getStringExtra("nome")
        double valorppro = it.getDoubleExtra("btnvoltar", 0);
        TextView tv = findViewById(R.id.textView);
        tv.setText(nome+" "+valor);
    }


    public void voltar(View v) {
        this.finish();

    }
}






