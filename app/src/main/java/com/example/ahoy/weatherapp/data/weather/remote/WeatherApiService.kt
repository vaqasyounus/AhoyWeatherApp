package com.example.ahoy.weatherapp.data.weather.remote

import com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse
import com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse
import com.example.ahoy.weatherapp.core.Constant
import com.example.ahoy.weatherapp.core.Constant.API_ENDPOINT_5DAYS
import com.example.ahoy.weatherapp.core.Constant.API_ENDPOINT_CURRENT
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET(API_ENDPOINT_CURRENT)
    suspend fun getCurrentWeather(
        @Query("q") location:String,
        @Query("units") unitSystem:String,
        @Query("appid") apiKey: String = Constant.API_KEY
    ): CurrentWeatherResponse

    @GET(API_ENDPOINT_5DAYS)
    suspend fun getLastFiveDaysWeather(
        @Query("q") location: String,
        @Query("units") unitSystem:String,
        @Query("appid") apiKey: String = Constant.API_KEY
    ): FiveDaysWeatherResponse
}