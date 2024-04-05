package com.example.mc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val intenthome = Intent(this, home::class.java )
            startActivity(intenthome)
        }

        binding.forgetps.setOnClickListener{
            val intentforgetps = Intent( this,  forget::class.java)
            startActivity(intentforgetps)
        }

        binding.registr.setOnClickListener{
            val intentreg = Intent( this, register::class.java)
            startActivity(intentreg)
        }
        }
    }
