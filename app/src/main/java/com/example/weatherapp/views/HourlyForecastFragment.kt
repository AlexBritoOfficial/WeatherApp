package com.example.weatherapp.views

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.Weather
import com.example.weatherapp.HourlyWeatherAdapter

class HourlyForecastFragment : Fragment(R.layout.hourly_forecast_fragment) {

    private lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val dataset = listOf<Weather>(
            Weather("MON","12PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","1PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","2PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","3PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","4PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","5PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","6PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","7PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","8PM", R.drawable.baseline_sunny_24, "85"),
            Weather("","9PM", R.drawable.baseline_nights_stay_24, "85")
        )

        recyclerView = view.findViewById(R.id.hourly_day_recycler_view)

        val adapter = HourlyWeatherAdapter(dataset)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

    }

}