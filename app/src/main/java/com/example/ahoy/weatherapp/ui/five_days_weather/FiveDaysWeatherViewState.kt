package com.example.ahoy.weatherapp.ui.five_days_weather

import com.example.ahoy.weatherapp.domain.weather.model.FiveDaysWeather

data class FiveDaysWeatherViewState(
    val fiveDaysWeather: FiveDaysWeather? = null,
    val isLoading: Boolean,
    val error: String? = null
)