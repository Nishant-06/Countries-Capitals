package com.example.countriescapitals.model

import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {
    //endpoint
    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>


}