package br.com.connectattoo.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.connectattoo.repository.UserSearchRepository
import br.com.connectattoo.utils.Constants
import kotlinx.coroutines.launch

class UserSearchViewModel : ViewModel() {

    private val _imagesTattooUserSearch = MutableLiveData<MutableList<String>>()
    val imagesTattooUserSearch: LiveData<MutableList<String>> = _imagesTattooUserSearch

    private val _message = MutableLiveData<String>()
    val message: LiveData<String> = _message

    fun getRandomTattoos(repository: UserSearchRepository, token: String) {

        viewModelScope.launch {
            repository.getRandomTattoos(
                Constants.LIMIT_USER_SEARCH_QUERY,
                token,
                object : Listener {

                    override fun onSuccess(link: String) {
                        _imagesTattooUserSearch.value?.add(link)
                    }

                    override fun onFailure(error: String) {
                        _message.value = error
                    }

                })
        }
    }

    interface Listener {
        fun onSuccess(link: String)
        fun onFailure(error: String)
    }
}
