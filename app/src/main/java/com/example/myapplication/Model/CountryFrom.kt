package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class CountryFrom(
    @SerializedName("code")
    val code: String,
    @SerializedName("name")
    val name: String
)