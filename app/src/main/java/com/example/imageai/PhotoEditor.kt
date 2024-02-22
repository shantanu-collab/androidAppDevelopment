package com.example.imageai

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var greyScaleButton: Button
    lateinit var originalImageView: ImageView
    var isFilterApplied: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        greyScaleButton = findViewById(R.id.blackAndWhite)
        originalImageView = findViewById(R.id.imageView2)
        greyScaleButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (!isFilterApplied) {
            originalImageView.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f) })
            Toast.makeText(this, "Filter applied.", Toast.LENGTH_LONG).show()
            isFilterApplied = true
        }
        else {
            originalImageView.clearColorFilter()
            Toast.makeText(this, "Filter removed.", Toast.LENGTH_LONG).show()
            isFilterApplied = false
        }
    }

}

