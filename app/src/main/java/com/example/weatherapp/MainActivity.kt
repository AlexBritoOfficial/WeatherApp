package com.example.weatherapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp.viewmodel.WeatherViewModel
import com.example.weatherapp.views.CurrentForecastFragment
import com.example.weatherapp.views.HourlyForecastFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var viewModel : WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        if(savedInstanceState != null){
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<CurrentForecastFragment>(R.id.current_day_fragment_container)
                add<CurrentForecastFragment>(R.id.hourly_forecast_fragment_container)
                add<CurrentForecastFragment>(R.id.ten_day_forecast_fragment_container)

            }
        }
    }
}