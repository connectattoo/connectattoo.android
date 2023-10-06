package com.flavio.connectattoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.flavio.connectattoo.databinding.ActivityMainBinding
import com.flavio.connectattoo.fragments.CadastroClienteFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentRender(R.id.containerFragment,CadastroClienteFragment())
    }

    private fun fragmentRender(containerId : Int, fragment: Fragment ){
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransacction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransacction.add(containerId, fragment)
        fragmentTransacction.commit()

    }
}