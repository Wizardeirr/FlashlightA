package com.volkankelleci.flashlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.volkankelleci.flashlight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button.setOnClickListener{


        }
    }
}