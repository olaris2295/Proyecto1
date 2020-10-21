package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2;
    TextView etiResultado;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        campo1 = this.<EditText>findViewById(R.id.campo1);
        campo2 = this.<EditText>findViewById(R.id.campo2);

        etiResultado = this.<TextView>findViewById(R.id.etiResultado);

    }


    public void onclick(View view) {

        num1 = Integer.parseInt(campo1.getText().toString());
        num2 = Integer.parseInt(campo2.getText().toString());
        switch (view.getId())
        {
            case R.id.btnSumar : sumar();
                break;
            case R.id.btnRestar : restar();
                break;
            case R.id.btnDividir : dividir();
                break;
            case R.id.btnMultiplicar : multiplicar();
                break;
        }
    }

    private void multiplicar() {
        int mult= num1*num2;
        etiResultado.setText("El resultado de la multiplicación es igual a: "+mult);
    }

    private void dividir() {

        if (num2>0) {
        float div= (float) num1/num2;
        etiResultado.setText("El resultado de la división es igual a: "+div);
    }
        else {
            Toast.makeText(this,"Advertencia",Toast.LENGTH_LONG).show();

            etiResultado.setText("Mini, Bug corregido");
        }
    }


    private void restar() {
        int restar= num1-num2;
        etiResultado.setText("El resultado de la resta es igual a: "+restar);
    }

    private void sumar() {
        int suma= num1+num2;
        etiResultado.setText("El resultado de la suma es igual a: "+suma);
    }
}

