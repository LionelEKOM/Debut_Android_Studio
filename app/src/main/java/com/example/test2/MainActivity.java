package com.example.test2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextVal1, editTextVal2;
    private TextView textViewResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextVal1 = findViewById(R.id.editTextVal1);
        editTextVal2 = findViewById(R.id.editTextVal2);
        Button buttonProduit = findViewById(R.id.buttonProduit);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        textViewResultat = findViewById(R.id.textViewResultat);

        buttonProduit.setOnClickListener(v -> calculerProduit());
        buttonDivision.setOnClickListener(v -> calculerDivision());
    }
    private void calculerProduit() {
        double val1 = Double.parseDouble(editTextVal1.getText().toString());
        double val2 = Double.parseDouble(editTextVal2.getText().toString());
        double resultat = val1 * val2;
        textViewResultat.setText(String.valueOf(resultat));

    }
    private void calculerDivision() {
        double val1 = Double.parseDouble(editTextVal1.getText().toString());
        double val2 = Double.parseDouble(editTextVal2.getText().toString());

        if (val2 != 0) {
            double resultat = val1 / val2;
            textViewResultat.setText(String.valueOf(resultat));
        } else {
            textViewResultat.setText(R.string.erreur_division_par_z_ro);
        }
    }
}