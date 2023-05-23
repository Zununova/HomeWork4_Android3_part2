package com.example.homework4_android3.models

import com.google.gson.annotations.SerializedName

data class CharacterModel(

    @SerializedName("id")
    val id: Int,

    @SerializedName("image")
    val image: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("status")
    val status: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("type")
    val type: String,

    @SerializedName("gender")
    val gender: String
)
