package com.example.ahoy.weatherapp.domain.weather.usecase

import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider
import com.example.ahoy.weatherapp.domain.weather.mapper.CurrentWeatherMapper
import com.example.ahoy.weatherapp.domain.weather.model.CurrentWeather
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository,
    private val currentWeatherMapper: CurrentWeatherMapper,
    unitProvider: UnitProvider) {
//    private var location = unitProvider.getLocation()
    private val unitSystem = unitProvider.getUnitSystem()

    suspend operator fun invoke(city: String): CurrentWeather {
        return currentWeatherMapper.currentWeatherResponseToCurrentWeather(
            currentWeatherResponse = weatherRepository.fetchCurrentWeather(
                city,
                unitSystem
            ),
            unitSystem = unitSystem
        )
    }
}