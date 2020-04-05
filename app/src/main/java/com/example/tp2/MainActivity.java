package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText etDolares,etEuros;
private TextView resultado;
private RadioGroup radioGroup;
private RadioButton rbDolares, rbEuros;
private String checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hacerVista();
    }

    private void hacerVista()
    {
        etDolares = findViewById(R.id.ETeuros);
        etEuros = findViewById(R.id.ETdolares);
        resultado = findViewById(R.id.ETresultado);
        radioGroup = findViewById(R.id.RGopciones);
        rbDolares = findViewById(R.id.RBdolares);
        rbEuros = findViewById(R.id.RBeuros);

    }


    public void Clickeado (View view)
    {
        switch (view.getId())
        {
            case R.id.RBdolares:
                checked = "RBdolares";

                break;

            case R.id.RBeuros:
                checked = "RBeuros";
                break;
        }
    }

    public void HacerCuenta(View view) {
        double aux = 0;
        switch (checked)
        {
            case "RBeuros":
                aux = Integer.parseInt(etDolares.getText().toString()) *1.08;
                resultado.setText(Double.toString(aux) );
                break;

            case "RBdolares":
                aux = Integer.parseInt(etEuros.getText().toString()) *0.93;
                resultado.setText(Double.toString(aux));
                break;
        }
    }
}
