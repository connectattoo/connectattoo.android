package br.com.connectattoo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.databinding.GridSearchBinding
import br.com.connectattoo.ui.search.UserSearchViewHolder

class UserSearchAdapter(
    private val context: Context?,
    private var lisOfImagesTattooUserSearch: List<String> = listOf()
) : RecyclerView.Adapter<UserSearchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserSearchViewHolder {
        val item = GridSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserSearchViewHolder(item)
    }

    override fun onBindViewHolder(holder: UserSearchViewHolder, position: Int) {
        holder.bind(lisOfImagesTattooUserSearch[position])
    }

    override fun getItemCount(): Int {
        return lisOfImagesTattooUserSearch.count()
    }

    fun updateImages(list: List<String>) {
        lisOfImagesTattooUserSearch = list
        notifyDataSetChanged()
    }

}
