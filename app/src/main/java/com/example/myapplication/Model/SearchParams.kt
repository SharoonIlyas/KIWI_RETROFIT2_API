package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class SearchParams(
    @SerializedName("flyFrom_type")
    val flyFromType: String,
    @SerializedName("seats")
    val seats: Seats,
    @SerializedName("to_type")
    val toType: String
)