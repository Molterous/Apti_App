package com.example.apti_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener {
            val data:Int=1

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }



        btn2.setOnClickListener {
            val data:Int=2

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }

        btn2.setOnClickListener {
            val data:Int=2

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn3.setOnClickListener {
            val data:Int=3

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn4.setOnClickListener {
            val data:Int=4

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn5.setOnClickListener {
            val data:Int=5

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn6.setOnClickListener {
            val data:Int=6

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn7.setOnClickListener {
            val data:Int=7

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn8.setOnClickListener {
            val data:Int=8

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn9.setOnClickListener {
            val data:Int=9

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
        btn10.setOnClickListener {
            val data:Int=10

            val intent= Intent(this, QuizQuestionActivity::class.java)

            intent.putExtra("ExtraData",data)

            startActivity(intent)

            //yaha pr data sharing krni h,


        }
    }
}