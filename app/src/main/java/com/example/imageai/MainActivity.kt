package com.example.imageai

import android.graphics.ColorFilter
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() , View.OnClickListener{
    lateinit var greyScaleButton : Button
    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greyScaleButton = findViewById(R.id.blackAndWhite)
        greyScaleButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        image = findViewById(R.id.imageView2)
        image.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})
        Toast.makeText(this,"Clicked on the grey scale triggered button!",Toast.LENGTH_LONG).show()
    }

}

