package com.example.happyplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var floatingbutton:FloatingActionButton=findViewById(R.id.fabAddHappyPlace)
        floatingbutton.setOnClickListener {
            val intent= Intent(this,AddHappyPlaceActivity::class.java)
            startActivity(intent)
        }


    }
}