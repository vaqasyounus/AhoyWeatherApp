package com.example.ahoy.weatherapp.data.weather.remote.dto

import com.google.gson.annotations.SerializedName

data class FiveDaysItemDto(
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("dt_txt")
    val dtTxt: String,
    @SerializedName("main")
    val main: MainDto,
    @SerializedName("weather")
    val weather: List<WeatherDto>,
    @SerializedName("wind")
    val wind: WindDto
) {
}