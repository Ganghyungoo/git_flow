package com.test.gitflowproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.gitflowproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToA.setOnClickListener {
            startActivity(Intent(this,MainActivityA::class.java))
        }

        binding.buttonToB.setOnClickListener {
            startActivity(Intent(this, MainActivityB::class.java))
        }
    }
}