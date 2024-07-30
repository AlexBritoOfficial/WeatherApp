package com.example.weatherapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.networking.WeatherAPI
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String> get() = _data

    init {
        fetchCurrentWeather()
    }

    private fun fetchCurrentWeather() {
        viewModelScope.launch {
            try {
                val response = WeatherAPI.retrofitService.getCurrentForecast()
                _data.value = response

            } catch (e: Exception) {

            }
        }
    }


}