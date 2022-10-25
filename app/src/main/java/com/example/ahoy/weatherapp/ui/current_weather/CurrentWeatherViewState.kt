package com.example.ahoy.weatherapp.ui.current_weather

import com.example.ahoy.weatherapp.domain.weather.model.CurrentWeather

data class CurrentWeatherViewState(
    val currentWeather:CurrentWeather?=null,
    val isLoading:Boolean,
    val anyError:Boolean=false,
    val errorMessage:String?=null
)