package com.example.asanarecognizer

import android.content.Intent
import android.hardware.camera2.CameraDevice
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View;
import android.widget.ActionMenuView
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val cameraButton = findViewById<FloatingActionButton>(R.id.camera_button)
        cameraButton.setOnClickListener {
           val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        }
    }
}

