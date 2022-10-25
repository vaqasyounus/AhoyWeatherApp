package com.example.ahoy.weatherapp.data.weather.remote.dto


import com.google.gson.annotations.SerializedName

data class CoordinateDto(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
)