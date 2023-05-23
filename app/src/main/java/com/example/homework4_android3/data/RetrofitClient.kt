package com.example.homework4_android3.data

import com.example.homework4_android3.data.remote.CharacterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private val retrofitClient = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun provideCharacterApiService(): CharacterApi {
        return retrofitClient.create(CharacterApi::class.java)
    }
}