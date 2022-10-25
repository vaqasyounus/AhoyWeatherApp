package com.example.ahoy.weatherapp.data.weather.remote.response


import com.example.ahoy.weatherapp.data.weather.remote.dto.*
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @SerializedName("base")
    val base: String,

    @SerializedName("cod")
    val cod: Int,

    @SerializedName("coord")
    val coordinate: CoordinateDto,

    @SerializedName("dt")
    val timestamp: Long,

    @SerializedName("id")
    val id: Int,

    @SerializedName("main")
    val main: MainDto,

    @SerializedName("name")
    val name: String,

    @SerializedName("sys")
    val countryInfo: CountryInfoDto,

    @SerializedName("visibility")
    val visibility: Int,

    @SerializedName("weather")
    val weather: List<WeatherDto>,

    @SerializedName("wind")
    val wind: WindDto
)