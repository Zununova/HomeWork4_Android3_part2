package com.example.homework4_android3.models

import android.icu.text.IDNA.Info
import com.google.gson.annotations.SerializedName

data class RickAndMortyResponse<T>(

    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<T>
)
