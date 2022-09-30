package com.example.myapplication_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.myapplication_3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.btn_login
        binding.bottomNavigationView.setOnItemSelectedListener{it1->
            when(it1.itemId)
            {
                R.id.btn_login->
                {
                    Intent(this,RegistrationActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
        binding.tvSignup.setOnClickListener{
            Intent(this,RegistrationActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}