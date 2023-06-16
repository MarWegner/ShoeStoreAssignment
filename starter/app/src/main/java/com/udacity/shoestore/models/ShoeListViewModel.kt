package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ShoeListViewModel: ViewModel() {

    private var _shoeList =  MutableLiveData<MutableList<Shoe>>()
    val shoeList : LiveData<MutableList<Shoe>>
        get() = _shoeList


    init {
        _shoeList.value = mutableListOf()
        addShoeToList("Nike Sneaker 1", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 2", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 3", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 4", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 5", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 6", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 7", 12.0,"Nike", "Comfortable standard sneaker color:white Comfortable standard sneaker color:white Comfortable standard sneaker color:whiteComfortable standard sneaker color:whiteComfortable standard sneaker color:whiteComfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 8", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 9", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 10", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 11", 12.0,"Nike", "Comfortable standard sneaker color:white")
        addShoeToList("Nike Sneaker 12", 12.0,"Nike", "Comfortable standard sneaker color:white")
    }

    fun addShoeToList(name:String, size: Double, company: String, description: String){
        _shoeList.value?.add(Shoe(name,size,company,description))
        Timber.i(name+ " added to list on intialize")
    }
    fun addShoeToList(shoe:Shoe){
        _shoeList.value?.add(shoe)
        Timber.i(shoe.name+ " added to list")

    }
}