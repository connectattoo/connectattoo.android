package br.com.connectattoo.ui.search

import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.databinding.GridSearchBinding
import com.bumptech.glide.Glide

class UserSearchViewHolder(private val bind: GridSearchBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(linkTattooImage: String) {
        val tattooUserSearchImage = bind.imageRecycler
        Glide.with(bind.root).load(linkTattooImage[position]).into(tattooUserSearchImage)
    }

}
