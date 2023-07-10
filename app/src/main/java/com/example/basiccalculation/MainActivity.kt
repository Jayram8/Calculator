package com.example.basiccalculation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != ""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sum = no1 + no2

                Toast.makeText(this,"the sum is $sum",Toast.LENGTH_LONG).show()
                
            }
            else{
                Toast.makeText(this,"Please Fill the Form",Toast.LENGTH_LONG).show()
            }
        }
        btnSub.setOnClickListener{
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != ""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sub = no1 - no2

                Toast.makeText(this,"the Subtracts is $sub",Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(this,"Please Fill the Form",Toast.LENGTH_LONG).show()
            }
        }
        btnMul.setOnClickListener{
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != ""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1 * no2

                Toast.makeText(this,"the Multiplication is $mul",Toast.LENGTH_LONG).show()

            }
            else{
                Toast.makeText(this,"Please Fill the Form",Toast.LENGTH_LONG).show()
            }
        }
        btnDiv.setOnClickListener{
            if (edtNo1.text.toString() != "" && edtNo2.text.toString() != ""){
                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                var div: Int
                if(no2 == 0){
                    div=0
                    Toast.makeText(this, "Can't be divided by Zero", Toast.LENGTH_LONG).show()
                }else {
                    val div = no1 / no2
                    Toast.makeText(this, "the Division is $div", Toast.LENGTH_LONG).show()
                }

            }
            else{
                Toast.makeText(this,"Please Fill the Form",Toast.LENGTH_LONG).show()
            }
        }
    }
}