package br.com.myheroesmarvel.model

import com.google.gson.annotations.SerializedName

data class Urls(

    @SerializedName("type") val type : String,
    @SerializedName("url") val url : String
)
