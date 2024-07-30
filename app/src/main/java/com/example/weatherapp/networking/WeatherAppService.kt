package com.example.weatherapp.networking

import com.example.weatherapp.Weather
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


private var API_KEY = "de16327606224cf1be615425243007"
private val BASE_URL = "https://api.weatherapi.com/v1"

private val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build()

object WeatherAPI {
    val retrofitService: WeatherAppService by lazy{
        retrofit.create(WeatherAppService::class.java)
    }
}

interface WeatherAppService {

    @GET("/current.json?q=Boston&key=de16327606224cf1be615425243007")
    suspend fun getCurrentForecast(): String
}