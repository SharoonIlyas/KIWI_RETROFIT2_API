package com.example.myapplication
import com.example.myapplication.Model.model
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface JsonPlaceholderApi {

    @GET("flights?v=3&sort=popularity&asc=0&locale=en&daysInDestinationFrom=&daysInDestinationTo" +
            "=&affilid=&children=0&infants=0&flyFrom=49.2-16.61-250km&to=anywhere&featureName=aggregateResults&" +
            "dateTo=06/04/2021&typeFlight=oneway&returnFrom=&returnTo=&one_per_date=0&oneforcity=1&wait_for_refresh=0&adults=1&partner=skypicker-android")
    suspend fun getUsers(@Query("limit") limit:Int , @Query("dateFrom") date: String):Response<model>
}