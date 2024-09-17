package com.asn8.topgames

import GameModel
import com.airbnb.epoxy.TypedEpoxyController

class GameEpoxyController(private val onClickCallback :(String) -> Unit):TypedEpoxyController<List<GameModel>>() {
    override fun buildModels(games: List<GameModel>?) {
        games?.forEach { game ->
            GameEpoxyModel(
                game = game,
                onClickCallback = onClickCallback )
                .id(game.GmText)
                .addTo(this)
        }
    }
}