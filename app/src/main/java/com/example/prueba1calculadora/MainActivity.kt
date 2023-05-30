package com.example.prueba1calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNumero1: EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnSumar : Button
    lateinit var btnrestar : Button
    lateinit var btnMultiplicar : Button
    lateinit var btnDivision : Button
    lateinit var txtresultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.editTextNumber)
        edtNumero2 = findViewById(R.id.editTextNumber2)
        btnSumar = findViewById(R.id.SUMA)
        btnrestar = findViewById(R.id.RESTA)
        btnMultiplicar = findViewById(R.id.MULTIPLICACION)
        btnDivision = findViewById(R.id.DIVISION)
        txtresultado = findViewById(R.id.resultado)


        btnSumar.setOnClickListener(View.OnClickListener   {

            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtresultado.setText("resultado: " + sumar(num1, num2))

        })

        btnrestar.setOnClickListener(View.OnClickListener   {

            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtresultado.setText("resultado: " + restar(num1, num2))

        })


        btnMultiplicar.setOnClickListener(View.OnClickListener   {

            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtresultado.setText("resultado: " + multi(num1, num2))

        })


        btnDivision.setOnClickListener(View.OnClickListener {
            try {

                val num1 = Integer.parseInt(edtNumero1.text.toString())
                val num2 = Integer.parseInt(edtNumero2.text.toString())

                txtresultado.setText("resultado: " + division(num1, num2))

            } catch (ex: Exception){
                txtresultado.setText("indefinicion")

            }
        })
    }

    fun sumar (numero1: Int, numero2: Int): Int {

        return numero1 + numero2
    }
    fun restar (numero1: Int, numero2: Int): Int {

        return numero1 - numero2
    }
    fun multi (numero1: Int, numero2: Int): Int {

        return numero1 * numero2
    }
    fun division (numero1: Int, numero2: Int): Int {

        return numero1 / numero2
    }
}