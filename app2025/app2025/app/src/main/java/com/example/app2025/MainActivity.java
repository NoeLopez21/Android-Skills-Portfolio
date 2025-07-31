package com.example.app2025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnEjercicio1, btnEjercicio2, btnEjercicio3, btnEjercicio4,
            btnEjercicio5, btnEjercicio6, btnEjercicio7, btnEjercicio8,
            btnEjercicio9, btnEjercicio10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarBotones();
        configurarListeners();
    }

    private void inicializarBotones() {
        btnEjercicio1 = findViewById(R.id.btnEjercicio1);
        btnEjercicio2 = findViewById(R.id.btnEjercicio2);
        btnEjercicio3 = findViewById(R.id.btnEjercicio3);
        btnEjercicio4 = findViewById(R.id.btnEjercicio4);
        btnEjercicio5 = findViewById(R.id.btnEjercicio5);
        btnEjercicio6 = findViewById(R.id.btnEjercicio6);
        btnEjercicio7 = findViewById(R.id.btnEjercicio7);
        btnEjercicio8 = findViewById(R.id.btnEjercicio8);
        btnEjercicio9 = findViewById(R.id.btnEjercicio9);
        btnEjercicio10 = findViewById(R.id.btnEjercicio10);
    }

    private void configurarListeners() {
        btnEjercicio1.setOnClickListener(v -> abrirActividad(Ejercicio1Activity.class));
        btnEjercicio2.setOnClickListener(v -> abrirActividad(Ejercicio2Activity.class));
        btnEjercicio3.setOnClickListener(v -> abrirActividad(Ejercicio3Activity.class));
        btnEjercicio4.setOnClickListener(v -> abrirActividad(Ejercicio4Activity.class));
        btnEjercicio5.setOnClickListener(v -> abrirActividad(Ejercicio5Activity.class));
        btnEjercicio6.setOnClickListener(v -> abrirActividad(Ejercicio6Activity.class));
        btnEjercicio7.setOnClickListener(v -> abrirActividad(Ejercicio7Activity.class));
        btnEjercicio8.setOnClickListener(v -> abrirActividad(Ejercicio8Activity.class));
        btnEjercicio9.setOnClickListener(v -> abrirActividad(Ejercicio9Activity.class));
        btnEjercicio10.setOnClickListener(v -> abrirActividad(Ejercicio10Activity.class));
    }

    private void abrirActividad(Class<?> clase) {
        Intent intent = new Intent(this, clase);
        startActivity(intent);
    }
}
