package com.example.weatherapp.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.R
import com.example.weatherapp.Weather
import com.example.weatherapp.viewmodel.WeatherViewModel

class CurrentForecastFragment(): Fragment(R.layout.current_forecast_fragment) {

    private lateinit var viewModel: WeatherViewModel
    private lateinit var cityName: TextView
    private lateinit var currenTime: TextView
    private lateinit var cityTemp: TextView
    private lateinit var weatherIcon: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cityName = view.findViewById(R.id.current_city_name_text_view)
        currenTime = view.findViewById(R.id.current_time_text_view)
        cityTemp = view.findViewById(R.id.current_temp_text_view)
        weatherIcon = view.findViewById(R.id.current_weather_icon_description_image_view)
    }
}