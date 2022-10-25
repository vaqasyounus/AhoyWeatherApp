package com.example.ahoy.weatherapp.data.weather.remote.dto


import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("country")
    val country: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("sunrise")
    val sunrise: Int,
    @SerializedName("sunset")
    val sunset: Int
)