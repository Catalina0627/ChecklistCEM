package com.stasoft.checklistcem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_calendario : AppCompatActivity() {

    private lateinit var banding: Any
    private lateinit var binding: ActivityMainBinding

    class ActivityMainBinding {
        object inflate {

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        banding = ActivityMainBinding.inflate
        setContentView(R.layout.activity_calendario)
    }
}


