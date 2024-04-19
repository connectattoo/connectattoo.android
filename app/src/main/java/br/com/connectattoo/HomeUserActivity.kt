package br.com.connectattoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.connectattoo.ui.search.UserSearchFragment

class HomeUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Configuração para testar layout. Voltar para o activity_home_user quando pronto
        setContentView(R.layout.fragment_user_search)

    }
}
