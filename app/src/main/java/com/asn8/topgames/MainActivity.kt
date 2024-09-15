package com.asn8.topgames

import GameAdapter
import GameModel
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val gameList:ArrayList<GameModel> = ArrayList()
        gameList.add(GameModel(R.drawable.card1,"GAmes1"))
        gameList.add(GameModel(R.drawable.card2,"Games2"))
        gameList.add(GameModel(R.drawable.card3,"Games3"))
        gameList.add(GameModel(R.drawable.card4,"Games4"))
        gameList.add(GameModel(R.drawable.card5,"Games5"))
        gameList.add(GameModel(R.drawable.card6,"Games6"))

        val adapter = GameAdapter(gameList)
        recyclerView.adapter = adapter

    }
}