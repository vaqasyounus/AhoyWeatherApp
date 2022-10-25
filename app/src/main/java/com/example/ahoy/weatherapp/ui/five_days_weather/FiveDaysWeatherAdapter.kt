package com.example.ahoy.weatherapp.ui.five_days_weather

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ahoy.weatherapp.databinding.ItemFivedaysWeatherBinding
import com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem

class FiveDaysWeatherAdapter : RecyclerView.Adapter<FiveDaysWeatherAdapter.FiveDaysViewHolder>() {

    inner class FiveDaysViewHolder(val binding:ItemFivedaysWeatherBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<FiveDaysItem>(){
        override fun areItemsTheSame(oldItem: FiveDaysItem, newItem: FiveDaysItem): Boolean {
            return oldItem.dtTxt == newItem.dtTxt
        }

        override fun areContentsTheSame(oldItem: FiveDaysItem, newItem: FiveDaysItem): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this,differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FiveDaysViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return FiveDaysViewHolder(ItemFivedaysWeatherBinding.inflate(inflater,parent,false))
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: FiveDaysViewHolder, position: Int) {
        val weather = differ.currentList[position]
        holder.binding.fiveDayItem = weather
    }
}