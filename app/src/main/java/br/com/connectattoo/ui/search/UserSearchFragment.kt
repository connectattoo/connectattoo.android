package br.com.connectattoo.ui.search

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.connectattoo.R
import com.google.android.material.search.SearchView

class UserSearchFragment : Fragment() {

    companion object {
        fun newInstance() = UserSearchFragment()
    }

    //private val viewModel: UserSearchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Use the ViewModel

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val searchView = view?.findViewById<SearchView>(R.id.search_user)
        searchView?.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_user_search, container, false)
    }


}
