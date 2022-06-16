package dev.waceke.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber1: TextInputLayout
    lateinit var etNumber1: TextInputEditText
    lateinit var tilNumber2: TextInputLayout
    lateinit var etNumber2: TextInputEditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvCalculate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilNumber1=findViewById(R.id.tilNumber1)
        etNumber1=findViewById(R.id.etNumber1)
        tilNumber2=findViewById(R.id.tilNumber2)
        etNumber2=findViewById(R.id.etNumber2)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivision=findViewById(R.id.btnDivision)
        tvCalculate=findViewById(R.id.tvCalculate)

        btnAddition.setOnClickListener {
            val num1=etNumber1.text.toString().toDouble()
            val num2=etNumber2.text.toString().toDouble()
            plus(num1,num2)
        }
        btnSubtraction.setOnClickListener {
            val num1=etNumber1.text.toString().toDouble()
            val num2=etNumber2.text.toString().toDouble()
            minus(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1=etNumber1.text.toString().toDouble()
            val num2=etNumber2.text.toString().toDouble()
            remainder(num1,num2)
        }
        btnDivision.setOnClickListener {
            val num1=etNumber1.text.toString().toDouble()
            val num2=etNumber2.text.toString().toDouble()
            division(num1,num2)
        }
    }
    fun plus(num1:Double, num2:Double){
        val total=num1+num2
        tvCalculate.text= total.toString()

    }
    fun minus(num1:Double, num2:Double){
        val total=num1-num2
        tvCalculate.text= total.toString()

    }
    fun division(num1:Double, num2:Double){
        val total=num1/num2
        tvCalculate.text= total.toString()
    }
    fun remainder(num1:Double, num2:Double){
        val total=num1%num2
        tvCalculate.text= total.toString()
    }

}



