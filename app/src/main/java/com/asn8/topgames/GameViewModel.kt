package com.asn8.topgames

import GameModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private val _gameList = MutableLiveData<List<GameModel>>()
    val gameList : LiveData<List<GameModel>> get() = _gameList
    init {
        _gameList.value = listOf(
            // Load or initialize your list of games
            GameModel(R.drawable.card1,"Horizon Chase"),
            GameModel(R.drawable.card2,"Pubg"),
            GameModel(R.drawable.card3,"Head Ball"),
            GameModel(R.drawable.card4,"Hooked"),
            GameModel(R.drawable.card5,"FIFA"),
            GameModel(R.drawable.card6,"Fortnite")
        )
    }

    // Add other game-related methods, like adding or removing games if needed
}