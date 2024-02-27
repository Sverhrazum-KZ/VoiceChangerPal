package com.example.voicechangerpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Версия с работающей сетОнКликЛистенер но которая просто выводит тост
class MainActivity : AppCompatActivity(),MyAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val itemList = listOf(
            Item(R.drawable.elephant, "Піл"),
            Item(R.drawable.wolf, "Қасқыр"),
            // добавьте больше элементов по мере необходимости
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = MyAdapter(itemList,this)
val mainButton=findViewById<Button>(R.id.main_button)


        mainButton.setOnClickListener {
            val editText1 = findViewById<EditText>(R.id.main_editText)
            val text = editText1.text.toString()
            val intent = Intent(this, ChangeActivity::class.java)
            intent.putExtra("key", text)
            startActivity(intent)
        }





    }
    override fun onItemClick(item: Item) {
        // Обработка нажатия на элемент (например, открытие второй активити)
        // Используйте объект item для получения данных
        Toast.makeText(this, "${item.text} нажато", Toast.LENGTH_SHORT).show()
    }

}