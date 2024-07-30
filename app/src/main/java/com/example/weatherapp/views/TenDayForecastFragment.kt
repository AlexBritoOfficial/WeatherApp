package com.example.weatherapp.views

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.Weather
import com.example.weatherapp.HourlyWeatherAdapter
import com.example.weatherapp.TenDayWeatherAdapter

class TenDayForecastFragment: Fragment(R.layout.ten_day_forecast_fragment) {

    private lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = listOf<Weather>(
            Weather("MON", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("TUE", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("WED", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("THU", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("FRI", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("SAT", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("SUN", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("MON", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("TUE", "12PM",R.drawable.baseline_sunny_24, "85"),
            Weather("WED", "12PM",R.drawable.baseline_nights_stay_24, "85")
        )

        recyclerView = view.findViewById(R.id.ten_day_recycler_view)

        val adapter = TenDayWeatherAdapter(dataset)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

    }
}