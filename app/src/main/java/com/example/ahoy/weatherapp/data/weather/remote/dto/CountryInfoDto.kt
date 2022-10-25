package com.example.ahoy.weatherapp.data.weather.remote.dto


import com.google.gson.annotations.SerializedName

data class CountryInfoDto(

    @SerializedName("country")
    val country: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("sunrise")
    val sunrise: Long,

    @SerializedName("sunset")
    val sunset: Long
)