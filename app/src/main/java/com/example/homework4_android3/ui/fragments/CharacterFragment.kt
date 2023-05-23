package com.example.homework4_android3.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework4_android3.databinding.FragmentCharacterBinding
import com.example.homework4_android3.ui.adapters.CharacterAdapter

class CharacterFragment : Fragment() {

    private lateinit var binding: FragmentCharacterBinding
    private val characterAdapter = CharacterAdapter()


    private var viewModel: CharacterViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[CharacterViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setUpListeners()
        setUpRequest()
        setUpObserves()

    }

    private fun initialize() {
        binding.characterRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = characterAdapter
        }
    }


    private fun setUpListeners() {

    }

    private fun setUpRequest() {

        viewModel?.fetchCharacter("rick", "alive", "", "male", "")
    }

    private fun setUpObserves() {
        viewModel?.characterLifeData?.observe(viewLifecycleOwner) {
            characterAdapter.submitList(it?.results)
        }

        viewModel?.errorLifeData?.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
        }
    }
}