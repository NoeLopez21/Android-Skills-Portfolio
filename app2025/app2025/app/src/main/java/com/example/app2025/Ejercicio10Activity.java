package com.example.app2025;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio10Activity extends AppCompatActivity {

    private EditText txtA, txtB, txtC;
    private TextView lblResultado;
    private Button btnResolver, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);

        inicializarComponentes();
        configurarEventos();
    }

    private void inicializarComponentes() {
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtC = findViewById(R.id.txtC);
        lblResultado = findViewById(R.id.lblResultado);
        btnResolver = findViewById(R.id.btnResolver);
        btnVolver = findViewById(R.id.btnVolver);
    }

    private void configurarEventos() {
        btnResolver.setOnClickListener(v -> resolverEcuacion());
        btnVolver.setOnClickListener(v -> finish());
    }

    private void resolverEcuacion() {
        try {
            double a = Double.parseDouble(txtA.getText().toString());
            double b = Double.parseDouble(txtB.getText().toString());
            double c = Double.parseDouble(txtC.getText().toString());

            if (a == 0) {
                lblResultado.setText("El valor de 'a' no puede ser 0");
                lblResultado.setTextColor(Color.RED);
                return;
            }

            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante < 0) {
                lblResultado.setText("No tiene soluciones reales");
                lblResultado.setTextColor(Color.RED);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                lblResultado.setText("Una solución:\nx = " + String.format("%.2f", x));
                lblResultado.setTextColor(Color.BLACK);
            } else {
                double raiz = Math.sqrt(discriminante);
                double x1 = (-b + raiz) / (2 * a);
                double x2 = (-b - raiz) / (2 * a);
                lblResultado.setText("Dos soluciones:\nx₁ = " + String.format("%.2f", x1) +
                        "\nx₂ = " + String.format("%.2f", x2));
                lblResultado.setTextColor(Color.BLACK);
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Error: ingrese valores válidos");
            lblResultado.setTextColor(Color.RED);
        }
    }
}
