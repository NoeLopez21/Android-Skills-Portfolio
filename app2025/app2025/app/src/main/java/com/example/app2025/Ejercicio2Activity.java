package com.example.app2025;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class  Ejercicio2Activity extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto1, lblTexto2;
    private Button btnTraspasa1, btnTraspasa2, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        initViews();
        setupListeners();
    }

    private void initViews() {
        txtTexto = findViewById(R.id.txtTexto);
        lblTexto1 = findViewById(R.id.lblTexto1);
        lblTexto2 = findViewById(R.id.lblTexto2);
        btnTraspasa1 = findViewById(R.id.btnTraspasa1);
        btnTraspasa2 = findViewById(R.id.btnTraspasa2);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        btnTraspasa1.setOnClickListener(view -> {
            String texto = txtTexto.getText().toString().trim();
            lblTexto1.setText(texto);
        });

        btnTraspasa2.setOnClickListener(view -> {
            String texto = txtTexto.getText().toString().trim();
            lblTexto2.setText(texto);
        });

        btnRegresar.setOnClickListener(view -> finish());
    }
}
