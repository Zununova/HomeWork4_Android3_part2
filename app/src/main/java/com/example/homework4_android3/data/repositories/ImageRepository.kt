package com.example.homework4_android3.data.repositories

import com.example.homework4_android3.App
import com.example.homework4_android3.models.Image
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ImageRepository {

    fun addImage(
        image: Image,
        onResponse: (image: Image) -> Unit
    ) {
        App.imageApiService?.addImage(image)?.enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                if (response.isSuccessful && response.body() != null) {
                    onResponse(response.body()!!)
                }
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    fun deleteImage(
        id: Int,
        onResponse: (image: Image) -> Unit
    ) {
        App.imageApiService?.deleteImage(id)?.enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                if (response.isSuccessful && response.body() != null) {
                    onResponse(response.body()!!)
                }
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    fun updateImage(
        id: Int,
        image: Image,
        onResponse: (image: Image) -> Unit
    ) {
        App.imageApiService?.updateImage(id, image)?.enqueue(object : Callback<Image> {
            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                if (response.isSuccessful && response.body() != null) {
                    onResponse(response.body()!!)
                }
            }

            override fun onFailure(call: Call<Image>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}