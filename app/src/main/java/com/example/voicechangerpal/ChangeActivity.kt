package com.example.voicechangerpal

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChangeActivity:AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.change_activity)

            val intent = getIntent()
            val text = intent.getStringExtra("key")

            val editText2 = findViewById<EditText>(R.id.change_editText)
            editText2.setText(text)
        }
}