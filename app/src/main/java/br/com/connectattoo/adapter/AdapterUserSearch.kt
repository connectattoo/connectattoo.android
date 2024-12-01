package br.com.connectattoo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.databinding.GridSearchBinding

class AdapterUserSearch(private val myDataSet: MutableList<MyImage>) :
    RecyclerView.Adapter<UserSearchViewHolder>() {
    var i: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserSearchViewHolder {
        val item = GridSearchBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return UserSearchViewHolder(item)
    }

    override fun onBindViewHolder(holder: UserSearchViewHolder, position: Int) {
        holder.bind(myDataSet[position])
    }

    override fun getItemCount(): Int {
        return myDataSet.count()
    }

    fun updateTattooImages(listImagesTattoo: List<String>): MutableList<MyImage> {
        for (image in listImagesTattoo) {
            i++
            if (i != 8) {
                myDataSet.add(MyImage(image, false))
            } else {
                myDataSet.add(MyImage(image, true))
            }
        }
        notifyDataSetChanged()
        return myDataSet
    }

    data class MyImage(val tattooRandomImage: String, val isFullSpan: Boolean)

}
