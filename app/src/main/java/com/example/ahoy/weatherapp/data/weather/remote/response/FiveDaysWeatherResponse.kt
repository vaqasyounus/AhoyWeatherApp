package com.example.ahoy.weatherapp.data.weather.remote.response


import com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto
import com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto
import com.google.gson.annotations.SerializedName

data class FiveDaysWeatherResponse(
    @SerializedName("city")
    val city: CityDto,

    @SerializedName("cod")
    val cod: String,

    @SerializedName("list")
    val list: List<FiveDaysItemDto>,

    @SerializedName("message")
    val message: Int
)