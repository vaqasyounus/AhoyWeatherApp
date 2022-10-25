package com.example.ahoy.weatherapp.data.weather.remote

import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(
    private val weatherApiService: WeatherApiService
) {
    suspend fun fetchCurrentWeather(location:String,unitSystem:String)
        = weatherApiService.getCurrentWeather(location,unitSystem)

    suspend fun fetchFiveDaysWeather(location:String,unitSystem:String)
        = weatherApiService.getLastFiveDaysWeather(location,unitSystem)
}