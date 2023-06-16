package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.models.ShoeListViewModel
import timber.log.Timber

class ShoeDetailsFragment : Fragment() {

    private lateinit var binding: FragmentShoeDetailsBinding
    private val viewModel by activityViewModels<ShoeListViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_details,container,false)
        binding.saveButton.setOnClickListener { saveShoeAndCloseDetails() }
        binding.cancelButton.setOnClickListener { findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment()) }
        binding.shoe = Shoe("",0.0,"","")
        return binding.root
    }

    private fun saveShoeAndCloseDetails()
    {
        Timber.i("Shoelist length: "+viewModel.shoeList.value?.size)
        viewModel.addShoeToList(binding.shoe?:Shoe("",0.0,"",""))
        Timber.i(binding.shoe?.name + " "+ binding.shoe?.company)
        Timber.i("Shoelist length: "+viewModel.shoeList.value?.size)
        findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment())
    }
}