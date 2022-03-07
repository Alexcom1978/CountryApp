package com.example.countryapp


import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface RestCountriesAPI {
    @GET("/name/{name}")
  suspend fun getCountryByNames (@Path("name") cityname: String): List<Country>
}

var retrofit = Retrofit.Builder()
    .baseUrl("https://restcountries.com/v3.1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
var restCounries = retrofit.create(RestCountriesAPI::class.java)




