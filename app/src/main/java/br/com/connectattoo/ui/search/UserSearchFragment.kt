package br.com.connectattoo.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.connectattoo.adapter.AdapterUserSearch
import br.com.connectattoo.databinding.FragmentUserSearchBinding
import br.com.connectattoo.repository.UserSearchRepository
import br.com.connectattoo.ui.BaseFragment
import br.com.connectattoo.utils.Constants
import br.com.connectattoo.utils.DataStoreManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.launch

class UserSearchFragment : BaseFragment<FragmentUserSearchBinding>() {
    private lateinit var viewModel: UserSearchViewModel
    private var repository: UserSearchRepository = UserSearchRepository()
    private val recyclerSearch = binding.recyclerImagesSearch
    private lateinit var adapter: AdapterUserSearch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setupViews() {
        val searchView = binding.fragmentUserSearch
        searchView.visibility = View.VISIBLE

        recyclerSearch.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
            recyclerSearch.adapter = adapter
        observe()
        getRandomTattoos()
    }

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentUserSearchBinding {
        viewModel = ViewModelProvider(this).get(UserSearchViewModel::class.java)
        return FragmentUserSearchBinding.inflate(inflater, container, false)
    }

    private fun getRandomTattoos() {
        viewLifecycleOwner.lifecycleScope.launch {
            val token = DataStoreManager.getUserSettings(requireContext(), Constants.API_TOKEN)
            viewModel.getRandomTattoos(repository, token)
        }
    }

    private fun observe() {
        viewModel.imagesTattooUserSearch.observe(this) {
            adapter.updateTattooImages(it)
        }
        viewModel.message.observe(this) { Snackbar.make(requireView(), it, Snackbar.LENGTH_SHORT) }
    }
}
