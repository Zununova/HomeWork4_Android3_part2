package com.example.homework4_android3.ui.fragments.addImage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.homework4_android3.databinding.FragmentAddImageBinding
import com.example.homework4_android3.models.Image

class AddImageFragment : Fragment() {

    private var binding: FragmentAddImageBinding? = null
    private val viewModel by viewModels<ImageViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddImageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRequests()
    }

    private fun setupRequests() {
        binding?.btnAdd?.setOnClickListener {
            val image =
                "https://img3.akspic.ru/previews/5/5/4/1/7/171455/171455-zhivopis-illustracia-art-voda-oblako-500x.jpg"

            val imageBody = Image(101, "hello", image, image)
            viewModel.addImage(imageBody) {
                Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding?.btnDelete?.setOnClickListener {
            val int = 1
            viewModel.deleteImage(int) {
                Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding?.btnPost?.setOnClickListener {
            val int = 1
            val image =
                "https://pibig.info/uploads/posts/2022-11/1669759386_1-pibig-info-p-krasivie-oboi-na-zastavku-krasivo-1.jpg"
            val imageBody = Image(101, "hello", image, image)
            viewModel.updateImage(int, imageBody) {
                Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}