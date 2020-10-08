package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Seats(
    @SerializedName("adults")
    val adults: Int,
    @SerializedName("children")
    val children: Int,
    @SerializedName("infants")
    val infants: Int,
    @SerializedName("passengers")
    val passengers: Int
)