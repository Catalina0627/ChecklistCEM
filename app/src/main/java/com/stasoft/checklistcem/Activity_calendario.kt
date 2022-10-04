package com.stasoft.checklistcem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_calendario : AppCompatActivity() {

    private var banding: Any
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        banding = ActivityMainBinding.inflatec
        setContentView(R.layout.activity_calendario)
    }
}


