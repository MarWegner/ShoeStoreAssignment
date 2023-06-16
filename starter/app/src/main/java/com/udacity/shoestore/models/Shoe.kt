package com.udacity.shoestore.models

import android.os.Parcelable
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String, var size: Double, var company: String, var description: String,
                val images: List<String> = mutableListOf()) : Parcelable, BaseObservable() {
    @Bindable
    fun getStringSize():String{
        return size.toString()
    }
    @Bindable
    fun setStringSize(value: String) {
        size = value.toDouble()
    }
}
