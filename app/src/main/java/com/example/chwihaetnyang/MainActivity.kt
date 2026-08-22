package com.example.chwihaetnyang

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFECYCLE", "onCreate 호출됨")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "onStart 호출됨")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "onResume 호출됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "onPause 호출됨")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "onStop 호출됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "onDestroy 호출됨")
    }
}
