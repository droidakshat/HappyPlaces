package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class AddHappyPlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_happy_place)
        val toolBarAddHappyPlace:androidx.appcompat.widget.Toolbar=findViewById(R.id.toolbar_add_place)
        setSupportActionBar(toolBarAddHappyPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolBarAddHappyPlace.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}