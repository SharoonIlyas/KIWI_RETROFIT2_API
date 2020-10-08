package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class model(
    @SerializedName("airlinesList")
    val airlinesList: List<Any>,
    @SerializedName("airportsList")
    val airportsList: List<Airports>,
    @SerializedName("all_airlines")
    val allAirlines: List<Any>,
    @SerializedName("all_prices")
    val allPrices: AllPrices,
    @SerializedName("all_stopover_airports")
    val allStopoverAirports: List<String>,
    @SerializedName("all_stopover_countries")
    val allStopoverCountries: List<String>,
    @SerializedName("best_results")
    val bestResults: List<Any>,
    @SerializedName("connections")
    val connections: List<Any>,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("currency_rate")
    val currencyRate: Double,
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("del")
    val del: Int,
    @SerializedName("fx_rate")
    val fxRate: Double,
    @SerializedName("hashtags")
    val hashtags: List<Hashtag>,
    @SerializedName("location_hashtags")
    val locationHashtags: List<String>,
    @SerializedName("ref_tasks")
    val refTasks: List<Any>,
    @SerializedName("refresh")
    val refresh: List<Any>,
    @SerializedName("_results")
    val results: Int,
    @SerializedName("search_id")
    val searchId: String,
    @SerializedName("search_params")
    val searchParams: SearchParams,
    @SerializedName("time")
    val time: Int
)