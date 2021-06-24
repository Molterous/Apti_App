package com.example.apti_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_score.*

class scoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        val data=intent.getIntExtra("ExtraData",0)
        Toast.makeText(this,"correcr ans $data",Toast.LENGTH_SHORT).show()


        home.setOnClickListener {
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }



    }
}