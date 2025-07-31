package com.example.app2025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio5Activity extends AppCompatActivity {

    private RadioGroup groupPagos;
    private TextView lblSeleccion;
    private Button btnConfirmar, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        initViews();
        setupListeners();
    }

    private void initViews() {
        groupPagos = findViewById(R.id.groupPagos);
        lblSeleccion = findViewById(R.id.lblSeleccion);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        btnConfirmar.setOnClickListener(v -> {
            int selectedId = groupPagos.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton selected = findViewById(selectedId);
                lblSeleccion.setText("Seleccionado: " + selected.getText());
            } else {
                lblSeleccion.setText("No se seleccionó ningún método de pago.");
            }
        });

        btnRegresar.setOnClickListener(v -> {
            startActivity(new Intent(Ejercicio5Activity.this, MainActivity.class));
            finish();
        });
    }
}
