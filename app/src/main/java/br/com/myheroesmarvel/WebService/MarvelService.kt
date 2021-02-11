package br.com.myheroesmarvel.WebService

import br.com.myheroesmarvel.Repository.Characters
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {

    @GET("/v1/public/characters?ts=1&limit=9&apikey=bbc1086298a3b39f6d1ea018ee77aef1&hash=b716ef649f2a77d1e34ec1a1606729c21d55cf7a")
    fun getCharacters(@Query("offset") offset: Int): Characters

}