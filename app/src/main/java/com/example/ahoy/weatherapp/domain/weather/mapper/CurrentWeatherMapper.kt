package com.example.ahoy.weatherapp.domain.weather.mapper

import com.example.ahoy.weatherapp.core.WeatherUtils
import com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse
import com.example.ahoy.weatherapp.domain.weather.model.CurrentWeather
import javax.inject.Inject

class CurrentWeatherMapper @Inject constructor() {

    fun currentWeatherResponseToCurrentWeather(
        currentWeatherResponse: CurrentWeatherResponse,
        unitSystem:String
    ): CurrentWeather{

        return CurrentWeather(
            name = currentWeatherResponse.name,
            updatedDate = WeatherUtils.convertTimestampToDate(
                currentWeatherResponse.timestamp
            ),
            description = currentWeatherResponse.weather[0].description,
            temperature = WeatherUtils.getTemp(
                currentWeatherResponse.main.temp,
                unitSystem
            ),
            minTemperature = WeatherUtils.getMinTemp(
                currentWeatherResponse.main.tempMin,
                unitSystem
            ),
            maxTemperature = WeatherUtils.getMaxTemp(
                currentWeatherResponse.main.tempMax,
                unitSystem
            ),
            sunrise = WeatherUtils.getHourAndMinute(
                currentWeatherResponse.countryInfo.sunrise
            ),
            sunset = WeatherUtils.getHourAndMinute(
                currentWeatherResponse.countryInfo.sunset
            ),
            windSpeed = WeatherUtils.getWindSpeed(
                currentWeatherResponse.wind.speed
            ),
            pressure = WeatherUtils.getPressure(
                currentWeatherResponse.main.pressure
            ),
            feelsLike = currentWeatherResponse.main.feelsLike.toString(),
            humidity = WeatherUtils.getHumidity(
                currentWeatherResponse.main.humidity
            )
        )
    }
}