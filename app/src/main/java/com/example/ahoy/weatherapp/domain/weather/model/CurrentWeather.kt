package com.example.ahoy.weatherapp.domain.weather.model

data class CurrentWeather(
    val name:String,
    val updatedDate:String,
    val description:String,
    val temperature:String,
    val minTemperature:String,
    val maxTemperature:String,
    val sunrise:String,
    val sunset:String,
    val windSpeed:String,
    val pressure:String,
    val feelsLike:String,
    val humidity:String
)
