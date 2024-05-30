package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivision: Button
    private lateinit var etA: EditText
    private lateinit var etB: EditText
    private lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        btnAdd = findViewById<Button>(R.id.btn_add)
        btnSub = findViewById<Button>(R.id.btn_subtraction)
        btnMultiply = findViewById<Button>(R.id.btn_multiplication)
        btnDivision = findViewById<Button>(R.id.btn_division)

        etA = findViewById<EditText>(R.id.et_a)
        etB = findViewById<EditText>(R.id.et_b)
        resultTv = findViewById<TextView>(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val a = etA.text.toString().toDouble()
        val b = etB.text.toString().toDouble()
        var result = 0.0
        when (v?.id) {
            R.id.btn_add -> {
                result = a + b
            }

            R.id.btn_subtraction -> {
                result = a - b
            }

            R.id.btn_multiplication -> {
                result = a * b
            }

            R.id.btn_division -> {
                result = a / b
            }
        }

        resultTv.text = "Result: $result"
    }
}