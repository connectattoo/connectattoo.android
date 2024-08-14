package br.com.connectattoo.ui.chat


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.connectattoo.R
import br.com.connectattoo.adapter.ChatAdapter
import br.com.connectattoo.data.MessageUser
import br.com.connectattoo.databinding.FragmentUserChatBinding
import br.com.connectattoo.ui.BaseFragment


class UserChatFragment : BaseFragment<FragmentUserChatBinding>() {

    lateinit var adapterChat: ChatAdapter
    var listChat: MutableList<MessageUser> = mutableListOf()

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentUserChatBinding {
        return FragmentUserChatBinding.inflate(inflater, container, false)
    }

    override fun setupViews(){
        val recyclerChat = binding.RecyclerViewChat
        recyclerChat.layoutManager = LinearLayoutManager(context)
        recyclerChat.setHasFixedSize(true)
        adapterChat = ChatAdapter(requireContext(), listChat)
        recyclerChat.adapter = adapterChat
        messageItemList()
    }

    fun messageItemList(){
        val messade1 = MessageUser("Larissa Dias")
        listChat.add(messade1)
        val messade2 = MessageUser("Larissa Dias")
        listChat.add(messade2)
        val messade3 = MessageUser("Larissa Dias")
        listChat.add(messade3)
        val messade4 = MessageUser("Larissa Dias")
        listChat.add(messade4)
        val messade5 = MessageUser("Larissa Dias")
        listChat.add(messade5)
        val messade6 = MessageUser("Larissa Dias")
        listChat.add(messade6)
        val messade7 = MessageUser("Larissa Dias")
        listChat.add(messade7)
        val messade8 = MessageUser("Larissa Dias8")
        listChat.add(messade8)
        val messade9 = MessageUser("Larissa Dias9")
        listChat.add(messade9)
        val messade10 = MessageUser("Larissa Dias10")
        listChat.add(messade10)


    }


}
