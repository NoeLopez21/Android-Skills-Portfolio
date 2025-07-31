package com.example.app2025;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio1Activity extends AppCompatActivity {

    private TextView lblNombre, lblCiudad;
    private Button btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        initViews();
        setupListeners();
    }

    private void initViews() {
        lblNombre = findViewById(R.id.lblNombre);
        lblCiudad = findViewById(R.id.lblCiudad);

        btnOcultarNombre = findViewById(R.id.btnOcultarNombre);
        btnVisuNombre = findViewById(R.id.btnVisuNombre);
        btnOcultarCiudad = findViewById(R.id.btnOcultarCiudad);
        btnVisuCiudad = findViewById(R.id.btnVisuCiudad);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        btnOcultarNombre.setOnClickListener(view -> lblNombre.setVisibility(View.INVISIBLE));
        btnVisuNombre.setOnClickListener(view -> lblNombre.setVisibility(View.VISIBLE));

        btnOcultarCiudad.setOnClickListener(view -> lblCiudad.setVisibility(View.INVISIBLE));
        btnVisuCiudad.setOnClickListener(view -> lblCiudad.setVisibility(View.VISIBLE));

        btnRegresar.setOnClickListener(view -> finish());
    }
}

