package br.com.myheroesmarvel.webService

import br.com.myheroesmarvel.model.Characters
import br.com.myheroesmarvel.model.CharactersData
import br.com.myheroesmarvel.model.CharactersResults
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {

    @GET("/v1/public/characters")
    fun getCharacters(
        @Query("offset") offset: Int

    ): Call<Characters>

}