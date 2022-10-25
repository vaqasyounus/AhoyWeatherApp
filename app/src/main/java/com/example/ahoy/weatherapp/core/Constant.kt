package com.example.ahoy.weatherapp.core

import com.example.ahoy.weatherapp.BuildConfig


object Constant {

    const val BASE_URL = BuildConfig.BASE_URL
    const val API_KEY = BuildConfig.API_KEY

    const val API_ENDPOINT_CURRENT = "weather"
    const val API_ENDPOINT_5DAYS = "forecast"

    const val IMAGE_BASE = "http://openweathermap.org/img/wn/"
    const val IMAGE_END = "@2x.png"

    const val UNIT_SYSTEM_KEY = "WEATHER_UNIT"
    const val UNIT_METRIC = "Metric"
    const val UNIT_SYSTEM_DEFAULT_VALUE = "Metric"
    const val LOCATION_KEY = "LOCATION"
    const val DEFAULT_LOCATION_VALUE = "Dubai"
}