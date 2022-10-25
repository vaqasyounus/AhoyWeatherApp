package com.example.ahoy.weatherapp.domain.weather.mapper

import com.example.ahoy.weatherapp.core.Constant.IMAGE_BASE
import com.example.ahoy.weatherapp.core.Constant.IMAGE_END
import com.example.ahoy.weatherapp.core.WeatherUtils
import com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto
import com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse
import com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem
import com.example.ahoy.weatherapp.domain.weather.model.FiveDaysWeather
import javax.inject.Inject

class FiveDaysWeatherMapper @Inject constructor() {

    fun fiveDaysWeatherResponseToFiveDaysWeather(
        fiveDaysWeatherResponse: FiveDaysWeatherResponse,
        unitSystem:String
    ):FiveDaysWeather{
        val fiveDaysItemList: List<FiveDaysItem> = fiveDaysWeatherResponse.list.map { fiveDaysItemDto ->
            fiveDaysItemDtoToFiveDaysItem(fiveDaysItemDto,unitSystem)
        }
        return FiveDaysWeather(fiveDaysItemList)
    }
    private fun fiveDaysItemDtoToFiveDaysItem(
        fiveDaysItemDto: FiveDaysItemDto,
        unitSystem:String
    ):FiveDaysItem{
        return FiveDaysItem(
            dtTxt= fiveDaysItemDto.dtTxt,
            temperature = WeatherUtils.getTemp(fiveDaysItemDto.main.temp, unitSystem),
            iconUrl = IMAGE_BASE+fiveDaysItemDto.weather[0].icon+IMAGE_END
        )
    }
}