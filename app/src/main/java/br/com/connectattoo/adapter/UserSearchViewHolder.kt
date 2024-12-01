package br.com.connectattoo.adapter

import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.databinding.GridSearchBinding
import com.bumptech.glide.Glide

class UserSearchViewHolder(private val bind: GridSearchBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(listImagesTattoo: AdapterUserSearch.MyImage) {
        bind.imgTattooCard.apply { Glide.with(this).load(listImagesTattoo).into(this) }
    }
}
