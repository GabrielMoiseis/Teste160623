package com.example.teste160623;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Projeto extends AppCompatActivity {

    Double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telasimples);

        Button btncalcular=(Button)findViewById(R.id.btncalcular);

        Button btn=(Button)findViewById(R.id.btncalcular);
        TextView tv_resposta=(TextView)findViewById(R.id.tv_resposta);
        EditText valorpor =(EditText)findViewById(R.id.valorpor);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(valorpor.getText().toString());
                res= num1/100*num2;
                tv_resposta.setText(String.valueOf(res));
            }
        });
        }
    }
