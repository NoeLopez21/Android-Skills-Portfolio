package com.example.app2025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio4Activity extends AppCompatActivity {

    private Button btnActualizar, btnRegresar;
    private TextView lblTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        initViews();
        setupListeners();
    }

    private void initViews() {
        btnActualizar = findViewById(R.id.btnActualizar);
        lblTexto = findViewById(R.id.lblTexto);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        btnActualizar.setOnClickListener(v ->
                lblTexto.setText("¡Texto actualizado correctamente!")
        );

        btnRegresar.setOnClickListener(v -> {
            startActivity(new Intent(Ejercicio4Activity.this, MainActivity.class));
            finish();
        });
    }
}

