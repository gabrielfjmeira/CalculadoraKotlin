package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var resultado = findViewById<TextView>(R.id.resultado);

        val buttonMais = findViewById<Button>(R.id.buttonMais);
        buttonMais.setOnClickListener{
            var number1Text = findViewById<TextView>(R.id.number1).text.toString();
            var number1 = number1Text.toDoubleOrNull();
            var number2Text = findViewById<TextView>(R.id.number2).text.toString();
            var number2 = number2Text.toDoubleOrNull();
            var calculo = number1?.plus(number2!!);
            var stringCalculo = String.format("%.2f", calculo);
            resultado.setText(stringCalculo);
        }

        val buttonMenos = findViewById<Button>(R.id.buttonMenos);
        buttonMenos.setOnClickListener{
            var number1Text = findViewById<TextView>(R.id.number1).text.toString();
            var number1 = number1Text.toDoubleOrNull();
            var number2Text = findViewById<TextView>(R.id.number2).text.toString();
            var number2 = number2Text.toDoubleOrNull();
            var calculo = number1?.minus(number2!!);
            var stringCalculo = String.format("%.2f", calculo);
            resultado.setText(stringCalculo);
        }

        val buttonMult = findViewById<Button>(R.id.buttonMult);
        buttonMult.setOnClickListener{
            var number1Text = findViewById<TextView>(R.id.number1).text.toString();
            var number1 = number1Text.toDoubleOrNull();
            var number2Text = findViewById<TextView>(R.id.number2).text.toString();
            var number2 = number2Text.toDoubleOrNull();
            var calculo = number1?.times(number2!!);
            var stringCalculo = String.format("%.2f", calculo);
            resultado.setText(stringCalculo);
        }

        val buttonDiv = findViewById<Button>(R.id.buttonDiv);
        buttonDiv.setOnClickListener{
            var number1Text = findViewById<TextView>(R.id.number1).text.toString();
            var number1 = number1Text.toDoubleOrNull();
            var number2Text = findViewById<TextView>(R.id.number2).text.toString();
            var number2 = number2Text.toDoubleOrNull();
            var calculo = number1?.div(number2!!);
            var stringCalculo = String.format("%.2f", calculo);
            resultado.setText(stringCalculo);
        }
    }
}