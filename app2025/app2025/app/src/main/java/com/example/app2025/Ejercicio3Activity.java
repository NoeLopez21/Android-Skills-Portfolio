package com.example.app2025;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio3Activity extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto;
    private Button btnVaciar, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        initViews();
        setupListeners();
    }

    private void initViews() {
        txtTexto = findViewById(R.id.txtTexto);
        lblTexto = findViewById(R.id.lblTexto);
        btnVaciar = findViewById(R.id.btnVaciar);
        btnRegresar = findViewById(R.id.btnRegresar);
    }

    private void setupListeners() {
        txtTexto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lblTexto.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        btnVaciar.setOnClickListener(v -> {
            txtTexto.setText("");
            lblTexto.setText("");
        });

        btnRegresar.setOnClickListener(v -> finish());
    }
}
