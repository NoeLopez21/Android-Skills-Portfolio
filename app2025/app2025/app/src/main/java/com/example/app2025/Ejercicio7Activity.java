package com.example.app2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio7Activity extends AppCompatActivity {

    private Spinner spinner;
    private TextView txtValor;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        initViews();
        setupSpinner();
        setupListeners();
    }

    private void initViews() {
        spinner = findViewById(R.id.spinner);
        txtValor = findViewById(R.id.txtValor);
        btnVolver = findViewById(R.id.btnVolver);
    }

    private void setupSpinner() {
        Integer[] valores = {0, 2, 4, 6, 8, 10};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, valores);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private void setupListeners() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object valorSeleccionado = parent.getItemAtPosition(position);
                txtValor.setText("El valor es: " + valorSeleccionado.toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtValor.setText("Seleccione un valor");
            }
        });

        btnVolver.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}
