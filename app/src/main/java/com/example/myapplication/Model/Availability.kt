package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Availability(
    @SerializedName("seats")
    val seats: Any
)