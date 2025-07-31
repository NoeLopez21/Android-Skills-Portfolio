package com.example.app2025;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio9Activity extends AppCompatActivity {

    private EditText txtNumero;
    private Button btnBorrar, btnRegresar;
    private LinearLayout contenedorNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        inicializarVistas();
        generarBotonesNumericos();
        configurarBotones();
    }

    private void inicializarVistas() {
        txtNumero = findViewById(R.id.txtNumero);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnRegresar = findViewById(R.id.btnRegresar);
        contenedorNumeros = findViewById(R.id.contenedorNumeros);
    }

    private void generarBotonesNumericos() {
        for (int i = 0; i <= 9; i++) {
            final String numero = String.valueOf(i);

            TextView lblNumero = new TextView(this);
            lblNumero.setText(numero);
            lblNumero.setTextSize(20);
            lblNumero.setTextColor(Color.WHITE);
            lblNumero.setBackgroundResource(R.drawable.selector_boton_numero); // fondo visual personalizado
            lblNumero.setPadding(40, 20, 40, 20);
            lblNumero.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(16, 16, 16, 16);
            lblNumero.setLayoutParams(params);

            lblNumero.setOnTouchListener((v, event) -> {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    txtNumero.append(numero);
                }
                return true;
            });

            contenedorNumeros.addView(lblNumero);
        }
    }

    private void configurarBotones() {
        btnBorrar.setOnClickListener(v -> txtNumero.setText(""));
        btnRegresar.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}
