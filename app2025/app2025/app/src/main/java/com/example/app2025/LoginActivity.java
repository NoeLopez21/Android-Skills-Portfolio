package com.example.app2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editUsuario, editContraseña;
    private Button btnIngresar;

    private static final String USUARIO_VALIDO = "tap2025@example.com";
    private static final String CONTRASEÑA_VALIDA = "tap*2025";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicializarComponentes();
        configurarBotonLogin();
    }

    private void inicializarComponentes() {
        editUsuario = findViewById(R.id.editUsuario);
        editContraseña = findViewById(R.id.editContraseña);
        btnIngresar = findViewById(R.id.btnIngresar);
    }

    private void configurarBotonLogin() {
        btnIngresar.setOnClickListener(v -> {
            String usuario = editUsuario.getText().toString().trim();
            String contraseña = editContraseña.getText().toString().trim();

            if (usuario.equals(USUARIO_VALIDO) && contraseña.equals(CONTRASEÑA_VALIDA)) {
                Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
