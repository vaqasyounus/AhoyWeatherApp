package com.example.ahoy.weatherapp.domain.weather.usecase

import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider
import com.example.ahoy.weatherapp.domain.weather.mapper.FiveDaysWeatherMapper
import com.example.ahoy.weatherapp.domain.weather.model.FiveDaysWeather
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository
import javax.inject.Inject

class GetFiveDaysWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository,
    private val fiveDaysWeatherMapper: FiveDaysWeatherMapper,
    unitProvider: UnitProvider
) {
    private val location = unitProvider.getLocation()
    private val unitSystem = unitProvider.getUnitSystem()

    suspend operator fun invoke(): FiveDaysWeather{
        return fiveDaysWeatherMapper.fiveDaysWeatherResponseToFiveDaysWeather(
            fiveDaysWeatherResponse = weatherRepository.fetchFiveDaysWeather(
                location,
                unitSystem
            ),
            unitSystem = unitSystem
        )
    }
}