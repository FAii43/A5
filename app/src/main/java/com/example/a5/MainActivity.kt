package com.example.a5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bc.setOnClickListener {
            tv.setText("0")
        }
        b7.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "7")
            } else {
                tv.setText(tv.text.toString() + "7")
            }
        }
        b8.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "8")
            } else {
                tv.setText(tv.text.toString() + "8")
            }
        }
        b9.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "9")
            } else {
                tv.setText(tv.text.toString() + "9")
            }
        }
        b4.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "4")
            } else {
                tv.setText(tv.text.toString() + "4")
            }
        }
        b5.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "5")
            } else {
                tv.setText(tv.text.toString() + "5")
            }
        }
        b6.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "6")
            } else {
                tv.setText(tv.text.toString() + "6")
            }
        }
        b1.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "1")
            } else {
                tv.setText(tv.text.toString() + "1")
            }
        }
        b2.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "2")
            } else {
                tv.setText(tv.text.toString() + "2")
            }
        }
        b3.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("")
                tv.setText(tv.text.toString() + "3")
            } else {
                tv.setText(tv.text.toString() + "3")
            }
        }
        b0.setOnClickListener {
            if (tv.text == "0") {
                tv.setText("0")
            } else {
                tv.setText(tv.text.toString() + "0")
            }
        }

        bd.setOnClickListener {
            if (tv.text == "0" || tv.text.length.toString() == "1") {
                tv.setText("0")
            } else {
                tv.setText(tv.text.toString().dropLast(1))
            }
        }
            var input = 0
            var op:String = ""
            var total = 0

        bpp.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "+"
            tv.setText("0")
        }

        bde.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "-"
            tv.setText("0")
        }

        bx.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "*"
            tv.setText("0")
        }

        bl.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "/"
            tv.setText("0")
        }

        bp.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "%"
            tv.setText("0")
        }
        bp.setOnClickListener {
            input = tv.text.toString().toInt()
            op = "%"
            tv.setText("0")
        }

        bo.setOnClickListener {
            if (!tv.text.toString().toFloat(".")) {
                tv.text = tv.text.toString() + "."
            }
        }



        be.setOnClickListener {
            if (op == "+") {
                total = input + tv.text.toString().toInt()
                tv.setText(total.toString())
            } else if (op == "-") {
                total = input - tv.text.toString().toInt()
                tv.setText(total.toString())
            } else if (op == "*") {
                total = input * tv.text.toString().toInt()
                tv.setText(total.toString())
            } else if (op == "/") {
                total = input / tv.text.toString().toInt()
                tv.setText(total.toString())
            }else if (op == "%") {
                total = input % tv.text.toString().toInt()
                tv.setText(total.toString())
            }
        }
    }
}