package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class DiscountData(
    @SerializedName("original_price")
    val originalPrice: Int
)