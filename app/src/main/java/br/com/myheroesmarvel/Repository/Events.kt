package br.com.myheroesmarvel.Repository

import com.google.gson.annotations.SerializedName

data class Events(

    @SerializedName("available") val available : Int,
    @SerializedName("collectionURI") val collectionURI : String,
    //@SerializedName("items") val items : List<Items>,
    @SerializedName("returned") val returned : Int
)