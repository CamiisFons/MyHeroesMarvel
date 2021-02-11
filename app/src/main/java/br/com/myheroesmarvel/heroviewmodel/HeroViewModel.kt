package br.com.myheroesmarvel.heroviewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.myheroesmarvel.repository.Characters
import br.com.myheroesmarvel.repository.CharactersResults
import br.com.myheroesmarvel.webService.InitializerAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HeroViewModel : ViewModel() {

    private val users by lazy { InitializerAPI() }
    private val liveData: MutableLiveData<List<CharactersResults>> = MutableLiveData()
    val publicLiveData: LiveData<List<CharactersResults>> = liveData

    fun getHeroesList(offset:Int){
        users.init().getCharacters(offset).enqueue(object : Callback<Characters>{
            override fun onResponse(
                call: Call<Characters>,
                response: Response<Characters>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        liveData.postValue(it.items)
                    }
                }
            }

            override fun onFailure(call: Call<Characters>, t: Throwable) {
                Log.d("Erro", t.message.toString())
            }

        })
    }


}