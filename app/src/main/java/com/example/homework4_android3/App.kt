package com.example.homework4_android3

import android.app.Application
import com.example.homework4_android3.data.RetrofitClient
import com.example.homework4_android3.data.remote.UserApiService

class App : Application() {

    companion object {
        var imageApiService: UserApiService? = null
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitClient = RetrofitClient()
        imageApiService = retrofitClient.provideImageService()
    }
}