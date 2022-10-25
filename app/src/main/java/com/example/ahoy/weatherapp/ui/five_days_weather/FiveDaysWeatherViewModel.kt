package com.example.ahoy.weatherapp.ui.five_days_weather

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase
import kotlinx.coroutines.launch

class FiveDaysWeatherViewModel @ViewModelInject constructor(
    private val getFiveDaysWeatherUseCase: GetFiveDaysWeatherUseCase
): ViewModel() {
    private val _uiState : MutableLiveData<FiveDaysWeatherViewState> = MutableLiveData()
    val uiState: LiveData<FiveDaysWeatherViewState>
        get() = _uiState

    init {
        getFiveDaysWeather()
    }

    private fun getFiveDaysWeather() = viewModelScope.launch {
        try {
            _uiState.value = FiveDaysWeatherViewState(isLoading = true)
            val result = getFiveDaysWeatherUseCase()
            _uiState.value= FiveDaysWeatherViewState(isLoading = false, fiveDaysWeather = result)
        }catch (e: Exception){
            _uiState.value = FiveDaysWeatherViewState(
                error = e.message ?: "An error occurred.",
                isLoading = false
            )
        }
    }
}