package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Airports(
    @SerializedName("filterName")
    val filterName: String,
    @SerializedName("name")
    val name: String
)