package com.example.ahoy.weatherapp.data.weather.remote.dto


import com.google.gson.annotations.SerializedName

data class WindDto(

    @SerializedName("deg")
    val deg: Int,

    @SerializedName("speed")
    val speed: String
)