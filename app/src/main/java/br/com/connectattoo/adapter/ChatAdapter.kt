package br.com.connectattoo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.data.MessageUser
import br.com.connectattoo.databinding.ChatUserItemLayoutBinding

class ChatAdapter (private val context: Context, private val listChat: MutableList<MessageUser>):
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val itemList = ChatUserItemLayoutBinding.inflate(LayoutInflater.from(context),parent, false)
        return ChatViewHolder(itemList)
    }

    override fun getItemCount() = listChat.size

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.name.text = listChat.get(position).name
    }

    inner class ChatViewHolder(binding: ChatUserItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){

        val name = binding.name

    }
}
