package com.example.imageai// com.example.imageai.BootUpActivity.kt
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imageai.MainActivity
import com.example.imageai.R

class BootUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.boot_up_screen)
        // Simulate a delay for demonstration purposes
        Thread.sleep(2000)

        // Navigate to the main activity or any other activity after the boot-up screen

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}