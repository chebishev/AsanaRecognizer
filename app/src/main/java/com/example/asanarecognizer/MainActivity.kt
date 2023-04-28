package com.example.asanarecognizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This works, so I have to figure out how to get tha camera or gallery open
        val cameraButton = findViewById<FloatingActionButton>(R.id.camera_button)
        cameraButton.setOnClickListener {
           println("Camera button clicked")
        }
        // The variant with intent = Intent(ACTION....) force closes the app
        // maybe startActivity(intent) isn't the right way to do it.

    }
}

