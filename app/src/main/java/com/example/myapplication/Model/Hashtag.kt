package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Hashtag(
    @SerializedName("count")
    val count: Int,
    @SerializedName("name")
    val name: String
)