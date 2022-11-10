package com.stasoft.checklistcem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.checklistcem.databinding.ActivityCalendarioBinding

class Activity_calendario : AppCompatActivity() {


    private lateinit var binding: ActivityCalendarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


