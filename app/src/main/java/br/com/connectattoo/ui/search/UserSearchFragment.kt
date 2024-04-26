package br.com.connectattoo.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.connectattoo.R
import br.com.connectattoo.adapter.UserSearchAdapter
import com.google.android.material.search.SearchView

class UserSearchFragment : Fragment() {
    private lateinit var viewModel: UserSearchViewModel
    private val adapter = UserSearchAdapter(context, listOf())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(UserSearchViewModel::class.java)
        val binding = inflater.inflate(R.layout.fragment_user_search, container, false)
        val searchView = view?.findViewById<SearchView>(R.id.search_user)
        searchView?.visibility = View.VISIBLE

        val recyclerSearch = requireView().findViewById<RecyclerView>(R.id.recycler_images_search)

        recyclerSearch.layoutManager = GridLayoutManager(context,3)
        recyclerSearch.adapter = adapter

        observe()

        return binding
    }

    private fun observe() {
        viewModel.imagesTattooUserSearch2.observe(viewLifecycleOwner) {
            adapter.updateImages(it)
        }
    }

}
