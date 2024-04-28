package br.com.connectattoo.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserSearchViewModel : ViewModel() {

    private val imagesTattooUserSearch: MutableLiveData<List<String>> = MutableLiveData(
        listOf(
       //lista de links das imagens
    ))

    val imagesTattooUserSearch2: LiveData<List<String>> = imagesTattooUserSearch

}
