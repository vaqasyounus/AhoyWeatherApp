package com.example.ahoy.weatherapp.data.weather.remote.dto


import com.google.gson.annotations.SerializedName

data class MainDto(

    @SerializedName("humidity")
    val humidity: String,

    @SerializedName("pressure")
    val pressure: Int,

    @SerializedName("temp")
    val temp: Double,

    @SerializedName("feels_like")
    val feelsLike: Double,

    @SerializedName("temp_max")
    val tempMax: Double,

    @SerializedName("temp_min")
    val tempMin: Double
)