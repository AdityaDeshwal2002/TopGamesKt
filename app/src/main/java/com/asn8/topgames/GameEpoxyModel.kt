package com.asn8.topgames

import GameModel
import com.asn8.topgames.databinding.ItemcardviewBinding
import com.asn8.topgames.epoxy.ViewBindingKotlinModel

class GameEpoxyModel(
    val game: GameModel,
    val onClickCallback: (String) -> Unit)
    : ViewBindingKotlinModel<ItemcardviewBinding>(R.layout.itemcardview) {
    override fun ItemcardviewBinding.bind() {
        cardText.text = game.GmText
        cardViewImg.setImageResource(game.img)
        root.setOnClickListener{
            onClickCallback(game.GmText)
        }
    }
}