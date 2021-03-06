package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Duration(
    @SerializedName("departure")
    val departure: Int,
    @SerializedName("return")
    val returnX: Int,
    @SerializedName("total")
    val total: Int
)