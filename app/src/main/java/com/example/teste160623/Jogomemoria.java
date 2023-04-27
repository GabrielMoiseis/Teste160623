package com.example.teste160623;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Jogomemoria extends AppCompatActivity {


    Button btnconf;
    EditText et_testeabc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogomemoria);



        btnconf = findViewById(R.id.btnconf);
        et_testeabc = findViewById(R.id.et_testeabc);

        Intent it = getIntent();
        String abc = it.getStringExtra("abcdefgghitopq");


        btnconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cba = et_testeabc.getText().toString();


                if (abc.equalsIgnoreCase(cba)) {

                    Intent it = new Intent(Jogomemoria.this, Acerto.class);
                    startActivity(it);


                    }
                });

            }
        }

}

