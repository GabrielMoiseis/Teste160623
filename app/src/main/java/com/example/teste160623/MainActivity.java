package com.example.teste160623;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonsomar=(Button)findViewById(R.id.buttonsomar);
        Button buttonsubtrair=(Button)findViewById(R.id.buttonsubtrair);
        Button buttonmultiplicar=(Button)findViewById(R.id.buttonmultiplicar);
        Button buttondividir=(Button)findViewById(R.id.buttondividir);

        Button btn=(Button)findViewById(R.id.buttonsomar);
        TextView tv_resultado=(TextView)findViewById(R.id.tv_resultado);
        EditText et_valor1=(EditText)findViewById(R.id.et_valor1);
        EditText et_valor2=(EditText)findViewById(R.id.tv_resultado);

        buttonsomar.setOnClickListener(new Viem.OnClicklistener(){
        public void onClick(Viem v){

            buttonsubtrair.setOnClickListener(new Viem.OnClicklistener(){
                public void onClick(Viem v) {
                }
                    buttonmultiplicar.setOnClickListener(new Viem.OnClicklistener(){
                        public void onClick(Viem v){
                    }
                            buttondividir.setOnClickListener(new Viem.OnClicklistener() {
                                public void onClick(Viem v) {
                                }
                            }
                }