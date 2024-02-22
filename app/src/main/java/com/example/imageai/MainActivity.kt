package com.example.imageai
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    lateinit var photoEditor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        photoEditor = findViewById(R.id.photoEdit)


        photoEditor.setOnClickListener {
            val intent = Intent(this, PhotoEditor::class.java)
            startActivity(intent)
    }
}}



