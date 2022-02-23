package com.joaopauloleitecosta.onactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {

    private EditText editNome;
    private Button btnRecuperarDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        editNome = findViewById(R.id.edit_nome);
        btnRecuperarDados = findViewById(R.id.btn_recuperardados);

        btnRecuperarDados.setOnClickListener(view -> {
            String nome = editNome.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("meu_nome", nome);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}