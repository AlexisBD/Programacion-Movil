

    package com.example.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla;
    public double operador1, operador2, resultado;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (EditText)findViewById(R.id.caja);
    }

    public void btn1(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "1";
        pantalla.setText(valor);
    }

    public void btn2(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "2";
        pantalla.setText(valor);
    }

    public void btn3(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "3";
        pantalla.setText(valor);
    }

    public void btn4(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "4";
        pantalla.setText(valor);
    }

    public void btn5(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "5";
        pantalla.setText(valor);
    }

    public void btn6(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "6";
        pantalla.setText(valor);
    }

    public void btn7(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "7";
        pantalla.setText(valor);
    }

    public void btn8(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "8";
        pantalla.setText(valor);
    }

    public void btn9(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "9";
        pantalla.setText(valor);
    }

    public void btn0(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + "0";
        pantalla.setText(valor);
    }

    public void btnPunto(View v) {
        String valor =  pantalla.getText().toString();
        valor =  valor + ".";
        pantalla.setText(valor);
    }


    public void suma(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 1;
    }

    public void resta(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 2;
    }

    public void multiplicacion(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 3;
    }


    public void divicion(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 4;
    }

    public void potencia(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 5;
    }

    public void porcentaje(View v) {
        try{
            String aux1 =  pantalla.getText.toString();
            operando1 = Double.parseDouble(aux1);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operacion = 6;
    }

    public void igual(View v) {
        try{
            String aux2 =  pantalla.getText.toString();
            operando2 = Double.parseDouble(aux2);
        } catch(NumberFormatException) {}
        pantalla.setText("");
        operaciones();
    }

    public void clear(View v) {
        pantalla.setText("");
        operador1 = 0.0;
        operador2 = 0.0;
        resultado = 0;
    }

    public  void finish(View v) {
        finish();
    }

    /*
     * Operaciones
     */

    public void operaciones() {

        if (operacion == 1) {
            resultado = operando1 + operando2;
        } else if (operacion == 2) {
            resultado =  operador1 -  operador2;
        } else if (operando == 3) {
            resultado  =  operador1 *  operador2;
        } else if (operando == 4) {
            if (operador2 == 0) {
                pantalla.setText("Error, no es posible dividir con el 0");
            } else {
                resultado = operador1 / operador2;
            }
        } else if (operacion == 5) {
            resultado =  Math.pow(operador1, operador2);
        } else if (operacion == 6) {
            resultado = operador1 / 100.0;
        }
    }
}
