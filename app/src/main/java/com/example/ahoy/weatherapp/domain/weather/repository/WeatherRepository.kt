package com.example.ahoy.weatherapp.domain.weather.repository

import com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse
import com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse

interface WeatherRepository {
    suspend fun fetchCurrentWeather(
        location:String,
        unitSystem:String
    ):CurrentWeatherResponse

    suspend fun fetchFiveDaysWeather(
        location:String,
        unitSystem:String
    ):FiveDaysWeatherResponse
}