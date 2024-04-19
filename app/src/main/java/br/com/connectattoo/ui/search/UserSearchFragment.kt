package br.com.connectattoo.ui.search

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import br.com.connectattoo.R
import br.com.connectattoo.adapter.UserSearchAdapter
import br.com.connectattoo.databinding.FragmentUserSearchBinding
import com.google.android.material.search.SearchView

class UserSearchFragment : Fragment() {
    private lateinit var viewModel: UserSearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Use the ViewModel

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(UserSearchViewModel::class.java)
        val binding = inflater.inflate(R.layout.fragment_user_search, container, false)
        val searchView = view?.findViewById<SearchView>(R.id.search_user)
        searchView?.visibility = View.VISIBLE

        val recyclerSearch = view?.findViewById<RecyclerView>(R.id.recycler_images_search)

        recyclerSearch?.layoutManager = LinearLayoutManager(context)

        recyclerSearch?.adapter = UserSearchAdapter()


        return binding
    }



}
