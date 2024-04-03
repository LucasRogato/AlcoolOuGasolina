package com.example.gasoualcool;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editPreçoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editPreçoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

        }

    public void calcularPreco (View view) {

        double precoAlcool = Double.parseDouble(editPreçoAlcool.getText().toString());
        double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

     /*Faz calulo (precoAlcool/ precoGasolina)
      Se resultado >=0.7 Melhor utilizar Gasolina
      Senão melhor utilizar alcool
      */
        double resultado = precoAlcool/ precoGasolina;

        if (resultado >= 0.7) {

            textResultado.setText("Melhor utilizar gasolina");

        } else {

            textResultado.setText("Melhor utilizar alcool");

        }
      }
    }
