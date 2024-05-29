package com.example.tutorial06_viewmodelimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textVieew:TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        //textVieew.setText(count.toString())

        /*button.setOnClickListener {
            count++;
            textVieew.setText(count.toString())
        }*/

        val viewModel = ViewModelProvider(this)[MainActivityData::class.java]
        textVieew.text = viewModel.count.value.toString()
        button.setOnClickListener {
            viewModel.increment()
        }
        viewModel.count.observe(this) {
            textVieew.text = it.toString()
        }

    }
}