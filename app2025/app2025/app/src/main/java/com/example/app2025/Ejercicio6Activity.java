package com.example.app2025;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Ejercicio6Activity extends AppCompatActivity {

    private ListView lstDisponibles, lstSeleccionados;
    private Button btnAgregar, btnQuitar, btnRegresar;
    private ArrayList<String> disponibles, seleccionados;
    private ArrayAdapter<String> adapterDisponibles, adapterSeleccionados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);

        lstDisponibles = findViewById(R.id.lstDisponibles);
        lstSeleccionados = findViewById(R.id.lstSeleccionados);
        btnAgregar = findViewById(R.id.btnAgregar);
        btnQuitar = findViewById(R.id.btnQuitar);
        btnRegresar = findViewById(R.id.btnRegresar);

        disponibles = new ArrayList<>();
        seleccionados = new ArrayList<>();

        disponibles.add("Matemáticas");
        disponibles.add("Español");
        disponibles.add("Ciencias");
        disponibles.add("Historia");
        disponibles.add("Geografía");

        adapterDisponibles = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, disponibles);
        adapterSeleccionados = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, seleccionados);

        lstDisponibles.setAdapter(adapterDisponibles);
        lstSeleccionados.setAdapter(adapterSeleccionados);

        lstDisponibles.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lstSeleccionados.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        btnAgregar.setOnClickListener(view -> {
            int pos = lstDisponibles.getCheckedItemPosition();
            if (pos != ListView.INVALID_POSITION) {
                String item = disponibles.remove(pos);
                seleccionados.add(item);
                adapterDisponibles.notifyDataSetChanged();
                adapterSeleccionados.notifyDataSetChanged();
                lstDisponibles.clearChoices();
            } else {
                mostrarMensaje("Por favor seleccione una materia de la lista izquierda.");
            }
        });

        btnQuitar.setOnClickListener(view -> {
            int pos = lstSeleccionados.getCheckedItemPosition();
            if (pos != ListView.INVALID_POSITION) {
                String item = seleccionados.remove(pos);
                disponibles.add(item);
                adapterSeleccionados.notifyDataSetChanged();
                adapterDisponibles.notifyDataSetChanged();
                lstSeleccionados.clearChoices();
            } else {
                mostrarMensaje("Por favor seleccione una materia de la lista derecha.");
            }
        });

        btnRegresar.setOnClickListener(view -> {
            Intent intent = new Intent(Ejercicio6Activity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void mostrarMensaje(String mensaje) {
        new AlertDialog.Builder(this)
                .setTitle("Aviso")
                .setMessage(mensaje)
                .setPositiveButton("OK", null)
                .show();
    }
}

