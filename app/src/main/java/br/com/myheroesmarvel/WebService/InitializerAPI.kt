package br.com.myheroesmarvel.WebService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class InitializerAPI {
    fun init(): MarvelService{
        return Retrofit.Builder()
            .baseUrl("https://gateway.marvel.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MarvelService::class.java)
    }


}