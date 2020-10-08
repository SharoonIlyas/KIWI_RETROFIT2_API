package com.example.myapplication.Model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("aTime")
    val aTime: Int,
    @SerializedName("aTimeUTC")
    val aTimeUTC: Int,
    @SerializedName("airlines")
    val airlines: List<String>,
    @SerializedName("availability")
    val availability: Availability,
    @SerializedName("baglimit")
    val baglimit: Baglimit,
    @SerializedName("bags_price")
    val bagsPrice: BagsPrice,
    @SerializedName("booking_token")
    val bookingToken: String,
    @SerializedName("cityCodeFrom")
    val cityCodeFrom: String,
    @SerializedName("cityCodeTo")
    val cityCodeTo: String,
    @SerializedName("cityFrom")
    val cityFrom: String,
    @SerializedName("cityTo")
    val cityTo: String,
    @SerializedName("conversion")
    val conversion: Conversion,
    @SerializedName("countryFrom")
    val countryFrom: CountryFrom,
    @SerializedName("countryTo")
    val countryTo: CountryTo,
    @SerializedName("dTime")
    val dTime: Int,
    @SerializedName("dTimeUTC")
    val dTimeUTC: Int,
    @SerializedName("deep_link")
    val deepLink: String,
    @SerializedName("discount_data")
    val discountData: DiscountData,
    @SerializedName("distance")
    val distance: Double,
    @SerializedName("duration")
    val duration: Duration,
    @SerializedName("facilitated_booking_available")
    val facilitatedBookingAvailable: Boolean,
    @SerializedName("fly_duration")
    val flyDuration: String,
    @SerializedName("flyFrom")
    val flyFrom: String,
    @SerializedName("flyTo")
    val flyTo: String,
    @SerializedName("has_airport_change")
    val hasAirportChange: Boolean,
    @SerializedName("hashtags")
    val hashtags: List<String>,
    @SerializedName("id")
    val id: String,
    @SerializedName("mapIdfrom")
    val mapIdfrom: String,
    @SerializedName("mapIdto")
    val mapIdto: String,
    @SerializedName("nightsInDest")
    val nightsInDest: Any,
    @SerializedName("p1")
    val p1: Int,
    @SerializedName("p2")
    val p2: Int,
    @SerializedName("p3")
    val p3: Int,
    @SerializedName("pnr_count")
    val pnrCount: Int,
    @SerializedName("popularity")
    val popularity: Any,
    @SerializedName("price")
    val price: Int,
    @SerializedName("quality")
    val quality: Double,
    @SerializedName("route")
    val route: List<Route>,
    @SerializedName("routes")
    val routes: List<List<String>>,
    @SerializedName("technical_stops")
    val technicalStops: Int,
    @SerializedName("tracking_pixel")
    val trackingPixel: String,
    @SerializedName("transfers")
    val transfers: List<Any>,
    @SerializedName("type_flights")
    val typeFlights: List<String>,
    @SerializedName("virtual_interlining")
    val virtualInterlining: Boolean
)