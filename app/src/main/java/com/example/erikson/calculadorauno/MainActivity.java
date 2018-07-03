package com.example.erikson.calculadorauno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numero1, numero2;
    Button suma , resta , multi , divi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText)findViewById(R.id.num1);
        numero2 = (EditText)findViewById(R.id.num2);
        suma = (Button)findViewById(R.id.sumar);
        resta = (Button)findViewById(R.id.restar);
        multi = (Button)findViewById(R.id.mult);
        divi = (Button)findViewById(R.id.div);
        resultado = (TextView)findViewById(R.id.result);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        double entero1 = Integer.parseInt(n1);
        double entero2 = Integer.parseInt(n2);

        double rta = 0;

        switch (view.getId()){
            case R.id.sumar:
                rta = entero1+entero2;
                break;
            case R.id.restar:
                rta = entero1-entero2;
                break;
            case R.id.mult:
                rta = entero1*entero2;
                break;
            case R.id.div:
                if (entero2 == 0){
                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                } else {
                    rta = entero1 / entero2;
                }
                break;
        }
        resultado.setText("" + rta);
    }
}
