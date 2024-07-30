package com.example.weatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HourlyWeatherAdapter(private val data: List<Weather>) :
    RecyclerView.Adapter<HourlyWeatherAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val curentTimeTextView: TextView
        val currentWeatherIcon: ImageView
        val currentTemp: TextView

        init {
            curentTimeTextView = view.findViewById(R.id.hourly_recycle_text_view)
            currentWeatherIcon = view.findViewById(R.id.hourly_recycle_weather_icon)
            currentTemp = view.findViewById(R.id.hourly_recycle_current_temp)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyWeatherAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.hourly_recyclerview_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HourlyWeatherAdapter.ViewHolder, position: Int) {
        holder.curentTimeTextView.text = data.get(position).time
        holder.currentWeatherIcon.id = data.get(position).icon
        holder.currentTemp.text = data.get(position).temp
    }

    override fun getItemCount(): Int {
        return data.size
    }

}