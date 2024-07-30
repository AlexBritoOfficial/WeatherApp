package com.example.weatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.HourlyWeatherAdapter.ViewHolder

class TenDayWeatherAdapter(val data: List<Weather>):RecyclerView.Adapter<TenDayWeatherAdapter.ViewHolder>()  {


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val dayOfWeekTextview: TextView
        val weekdayWeatherIcon: ImageView
        val weekdayCurrentTempFarenheit: TextView
        val weekdayCurrentTempCelcius: TextView

        init {
            dayOfWeekTextview = view.findViewById(R.id.week_day_ten_day_recycleview_text_view)
            weekdayWeatherIcon = view.findViewById(R.id.week_day_recycle_weather_icon)
            weekdayCurrentTempFarenheit = view.findViewById(R.id.weekday_recycle_current_temp_farenheit)
            weekdayCurrentTempCelcius = view.findViewById(R.id.weekday_recycle_current_temp_calcius)

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.ten_day_recyclerview_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.dayOfWeekTextview.text = data.get(position).dayOfWeek
        holder.weekdayWeatherIcon.id = data.get(position).icon
        holder.weekdayCurrentTempFarenheit.text = data.get(position).temp
        val celsius =  (( data.get(position).temp.toInt() - 32) * 5/9 ).toString()
        holder.weekdayCurrentTempCelcius.text = celsius

    }

    override fun getItemCount(): Int {
        return data.size
    }

}