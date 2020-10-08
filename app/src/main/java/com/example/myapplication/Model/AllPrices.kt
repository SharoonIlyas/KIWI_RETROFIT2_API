package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class AllPrices(
    @SerializedName("0-11")
    val x011: Int,
    @SerializedName("11-12")
    val x1112: Int,
    @SerializedName("12-13")
    val x1213: Int,
    @SerializedName("13-14")
    val x1314: Int,
    @SerializedName("14-15")
    val x1415: Int,
    @SerializedName("17-18")
    val x1718: Int,
    @SerializedName("178-188")
    val x178188: Int,
    @SerializedName("18-19")
    val x1819: Int,
    @SerializedName("20-21")
    val x2021: Int,
    @SerializedName("282-299")
    val x282299: Int,
    @SerializedName("30-32")
    val x3032: Int,
    @SerializedName("32-33")
    val x3233: Int,
    @SerializedName("33-35")
    val x3335: Int,
    @SerializedName("42-45")
    val x4245: Int,
    @SerializedName("47-50")
    val x4750: Int,
    @SerializedName("56-60")
    val x5660: Int,
    @SerializedName("63-67")
    val x6367: Int
)