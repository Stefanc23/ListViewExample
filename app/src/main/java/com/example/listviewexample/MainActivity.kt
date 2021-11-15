package com.example.listviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listviewexample.adapter.CoffeeAdapter
import com.example.listviewexample.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = DataSource().load()

        val coffeeList = findViewById<ListView>(R.id.coffee_list)
        val adapter = CoffeeAdapter(this, dataset)
        coffeeList.adapter = adapter
    }
}