package com.example.weatherapp

import kotlinx.serialization.Serializable
import java.time.LocalTime

@Serializable
data class Weather(
    val dayOfWeek: String,
    val time: String,
    val icon: Int,
    val temp: String
)