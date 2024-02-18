package com.example.imageai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() , View.OnClickListener{
    lateinit var greyScaleButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greyScaleButton = findViewById(R.id.blackAndWhite)
        greyScaleButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"Clicked on the grey scale triggered button!",Toast.LENGTH_LONG).show()

    }

}

