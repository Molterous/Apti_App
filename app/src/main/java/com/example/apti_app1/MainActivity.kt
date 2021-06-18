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
    }
}