package com.example.homework4_android3.data

import com.example.homework4_android3.data.remote.UserApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private val retrofitClient = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun provideImageService(): UserApiService {
        return retrofitClient.create(UserApiService::class.java)
    }
}