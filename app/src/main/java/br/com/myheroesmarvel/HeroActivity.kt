package br.com.myheroesmarvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.myheroesmarvel.adapter.CharactersAdapter
import br.com.myheroesmarvel.databinding.ActivityMainBinding
import br.com.myheroesmarvel.heroviewmodel.HeroViewModel

class HeroActivity : AppCompatActivity(){

    private val adapterHeroes = CharactersAdapter(ArrayList())

    private lateinit var bindind : ActivityMainBinding
    private lateinit var viewModel :HeroViewModel

    private var offset = 1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HeroViewModel::class.java)
        recyclerInit()
    }


        fun recyclerInit() {
            bindind = ActivityMainBinding.inflate(layoutInflater)
            setContentView(bindind.root)
            bindind.rvHero.adapter = adapterHeroes
            bindind.rvHero.layoutManager = LinearLayoutManager(this)
            bindind.rvHero.setHasFixedSize(true)
            viewModel.getHeroesList(offset)
        }


}


