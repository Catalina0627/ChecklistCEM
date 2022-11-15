package com.stasoft.checklistcem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep

class Activity_inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        sleep(3000)

        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }
}