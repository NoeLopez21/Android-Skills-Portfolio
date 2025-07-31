package com.example.app2025;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio8Activity extends AppCompatActivity {

    private EditText txtBase, txtExponente;
    private TextView lblResultado;
    private Button btnCalcular, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);

        initViews();
        setupListeners();
    }

    private void initViews() {
        txtBase = findViewById(R.id.txtBase);
        txtExponente = findViewById(R.id.txtExponente);
        lblResultado = findViewById(R.id.lblResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        btnCalcular.setOnClickListener(v -> calcularPotencia());
        btnRegresar.setOnClickListener(v -> finish());
    }

    private void calcularPotencia() {
        try {
            double base = Double.parseDouble(txtBase.getText().toString().trim());
            double exponente = Double.parseDouble(txtExponente.getText().toString().trim());
            double resultado = Math.pow(base, exponente);
            lblResultado.setText(String.format("Resultado: %.2f", resultado));
        } catch (NumberFormatException e) {
            lblResultado.setText("Error: ingrese números válidos.");
        }
    }
}
