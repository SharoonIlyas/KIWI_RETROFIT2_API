package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Route(
    @SerializedName("aTime")
    val aTime: Int,
    @SerializedName("aTimeUTC")
    val aTimeUTC: Int,
    @SerializedName("airline")
    val airline: String,
    @SerializedName("bags_recheck_required")
    val bagsRecheckRequired: Boolean,
    @SerializedName("cityCodeFrom")
    val cityCodeFrom: String,
    @SerializedName("cityCodeTo")
    val cityCodeTo: String,
    @SerializedName("cityFrom")
    val cityFrom: String,
    @SerializedName("cityTo")
    val cityTo: String,
    @SerializedName("combination_id")
    val combinationId: String,
    @SerializedName("dTime")
    val dTime: Int,
    @SerializedName("dTimeUTC")
    val dTimeUTC: Int,
    @SerializedName("equipment")
    val equipment: Any,
    @SerializedName("fare_basis")
    val fareBasis: String,
    @SerializedName("fare_category")
    val fareCategory: String,
    @SerializedName("fare_classes")
    val fareClasses: String,
    @SerializedName("fare_family")
    val fareFamily: String,
    @SerializedName("flight_no")
    val flightNo: Int,
    @SerializedName("flyFrom")
    val flyFrom: String,
    @SerializedName("flyTo")
    val flyTo: String,
    @SerializedName("found_on")
    val foundOn: String,
    @SerializedName("guarantee")
    val guarantee: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("last_seen")
    val lastSeen: Int,
    @SerializedName("latFrom")
    val latFrom: Double,
    @SerializedName("latTo")
    val latTo: Double,
    @SerializedName("lngFrom")
    val lngFrom: Double,
    @SerializedName("lngTo")
    val lngTo: Double,
    @SerializedName("mapIdfrom")
    val mapIdfrom: String,
    @SerializedName("mapIdto")
    val mapIdto: String,
    @SerializedName("operating_carrier")
    val operatingCarrier: String,
    @SerializedName("operating_flight_no")
    val operatingFlightNo: String,
    @SerializedName("original_return")
    val originalReturn: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("refresh_timestamp")
    val refreshTimestamp: Int,
    @SerializedName("return")
    val returnX: Int,
    @SerializedName("source")
    val source: String,
    @SerializedName("vehicle_type")
    val vehicleType: String
)