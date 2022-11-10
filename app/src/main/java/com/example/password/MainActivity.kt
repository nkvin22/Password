package com.example.password

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {




    private lateinit var pass: EditText
    private lateinit var pass1: EditText
    private lateinit var finish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar:  androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar?.hide()


        pass = findViewById(R.id.first)
        pass1 = findViewById(R.id.second)
        finish = findViewById(R.id.finish)


        finish.setOnClickListener {

            if(pass.text.toString().isEmpty() || pass1.text.toString().isEmpty()) {

                Toast.makeText(this, "SHEIYVANE PAROLI FJDFJD", Toast.LENGTH_LONG).show()
            }
            else if(pass.text.toString().length < 8 || !pass.text.toString().any{it.isDigit()}){

                pass.error = "minimum 8 AND ONE DIGIT"

            }

            else if(pass.text.toString() != pass1.text.toString()){

                pass1.error = "ar emtxveva kai"

            }

            else{

                Toast.makeText(this, "kaikaikai", Toast.LENGTH_LONG).show()

            }
        }



    }



}