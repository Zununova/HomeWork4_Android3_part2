package com.example.homework4_android3.data.remote

import com.example.homework4_android3.models.Image
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserApiService {

    @POST("photos")
    fun addImage(
        @Body image: Image
    ): Call<Image>

    @DELETE("photos/{id}")
    fun deleteImage(
        @Path("id") id: Int
    ): Call<Image>

    @PUT("photos/{id}")
    fun updateImage(
        @Path("id") id: Int,
        @Body updateImage: Image
    ): Call<Image>

}