package com.example.homework4_android3.ui.fragments.addImage

import androidx.lifecycle.ViewModel
import com.example.homework4_android3.data.repositories.ImageRepository
import com.example.homework4_android3.models.Image

class ImageViewModel : ViewModel() {

    private var repository = ImageRepository()

    fun addImage(
        image: Image,
        onResponse: (image: Image) -> Unit
    ) {
        repository.addImage(
            image,
            onResponse
        )
    }

    fun deleteImage(
        id: Int,
        onResponse: (image: Image) -> Unit
    ) {
        repository.deleteImage(
            id,
            onResponse
        )
    }

    fun updateImage(
        id: Int,
        image: Image,
        onResponse: (image: Image) -> Unit
    ) {
        repository.updateImage(
            id,
            image,
            onResponse
        )
    }
}