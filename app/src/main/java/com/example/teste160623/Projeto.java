package com.example.teste160623;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.teste160623.R;

public class Projeto extends AppCompatActivity {

    Double num1, num2, res;

    public Projeto(String usuarioId) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telasimples);

        Button btncalcular = findViewById(R.id.btncalcular);
        TextView tv_resposta = findViewById(R.id.tv_resposta);
        EditText valorpor = findViewById(R.id.valorpor);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(valorpor.getText().toString());
                num2 = 10.0;
                res = num1 / 100 * num2;
                tv_resposta.setText(String.valueOf(res));
            }
        });
    }

    public byte[] getIdUsuario() {


    }
}
