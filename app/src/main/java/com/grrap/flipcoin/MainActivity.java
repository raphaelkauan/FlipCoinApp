package com.grrap.flipcoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public  void caraCoroa(View view) {

        int numAleatorio = (int) (1 + Math.random() * 10); // gera um número inteiro aleatório entre 1 e 10

        String msg = "";

        if (numAleatorio >= 5) {
            msg = "Cara";
        } else {
            msg = "Coroa";
        }

        txtResultado.setText(msg);

    }
}