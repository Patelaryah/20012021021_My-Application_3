package com.example.myapplication_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication_3.databinding.ActivityRegistrationBinding
class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.bottomNavigationView
        binding.bottomNavigationView.setOnItemSelectedListener{it1->
            when(it1.itemId)
            {
                R.id.bottomNavigationView->
                {
                    Intent(this,LoginActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
        binding.tvLogin.setOnClickListener{
            Intent(this,LoginActivity::class.java).apply {startActivity(this)}
        }
    }
}
