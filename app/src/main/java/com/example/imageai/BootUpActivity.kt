package com.example.imageai
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BootUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.boot_up_screen)
        // Simulate a delay for demonstration purposes
        Thread.sleep(1000)

        // Navigate to the main activity or any other activity after the boot-up screen
        startActivity(Intent(this, MainActivity::class.java))
        finish()
        
    }
}