package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Conversion(
    @SerializedName("EUR")
    val eUR: Int
)