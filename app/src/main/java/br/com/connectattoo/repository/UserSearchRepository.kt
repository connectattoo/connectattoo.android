package br.com.connectattoo.repository

import br.com.connectattoo.api.ApiService
import br.com.connectattoo.api.ApiUrl
import br.com.connectattoo.ui.search.UserSearchViewModel
import br.com.connectattoo.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserSearchRepository {
    val apiService: ApiService = ApiUrl.instance.create(ApiService::class.java)

    suspend fun getRandomTattoos(
        limit: Int,
        token: String,
        listener: UserSearchViewModel.Listener
    ) {
        val call = apiService.getRandomTattoos(limit, token)
        call.enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                if (response.code() == Constants.CODE_SUCCESS_200) {
                    response.body()?.let { listener.onSuccess(it) }
                } else {
                    listener.onFailure("Erro ao carregar. Tente mais tarde")
                }

            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                listener.onFailure("Erro ao carregar. Tente mais tarde")
            }

        })
    }
}
