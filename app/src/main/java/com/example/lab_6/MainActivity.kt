package com.example.lab_6

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("onCreate")
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        showToast("onRestart")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
