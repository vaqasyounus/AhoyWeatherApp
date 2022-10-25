package com.example.ahoy.weatherapp.data.weather

import com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val remoteDataSource: WeatherRemoteDataSource
): WeatherRepository {

    override suspend fun fetchCurrentWeather(location:String,unitSystem:String)
        = remoteDataSource.fetchCurrentWeather(location,unitSystem)

    override suspend fun fetchFiveDaysWeather(location:String,unitSystem:String)
        = remoteDataSource.fetchFiveDaysWeather(location,unitSystem)
}