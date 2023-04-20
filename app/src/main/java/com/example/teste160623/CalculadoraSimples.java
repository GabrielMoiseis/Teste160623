package com.example.teste160623;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CalculadoraSimples extends AppCompatActivity {

    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonsomar = (Button) findViewById(R.id.buttonsomar);
        Button buttonsubtrair = (Button) findViewById(R.id.buttonsubtrair);
        Button buttonmultiplicar = (Button) findViewById(R.id.buttonmultiplicar);
        Button buttondividir = (Button) findViewById(R.id.buttondividir);

        Button btn = (Button) findViewById(R.id.buttonsomar);
        TextView tv_resultado = findViewById(R.id.tv_resultadoCSimples);
        EditText et_valor1 = (EditText) findViewById(R.id.et_valor1);
        EditText et_valor2 =  findViewById(R.id.et_valor2);

        buttonsomar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 + num2;

               // tv_resultado.setText(String.valueOf(res));
                tv_resultado.setText(String.valueOf(333));
                tv_resultado.setText(String.valueOf(num2));
            }
        });

        buttonsubtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 - num2;
                tv_resultado.setText(String.valueOf(res));


            }
        });

        buttonmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 * num2;
                tv_resultado.setText(String.valueOf(res));

            }
        });

        buttondividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 / num2;
                tv_resultado.setText(String.valueOf(res));


            }
        });
    }
}