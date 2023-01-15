package com.example.derdiedas

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/32bfd9a22ea5217979a3" )  //  "/posts"

    fun getWords(): Call<MutableList<WordModel>>
}