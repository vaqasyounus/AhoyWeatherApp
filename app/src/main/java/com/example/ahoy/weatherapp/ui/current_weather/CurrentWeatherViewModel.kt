package com.example.ahoy.weatherapp.ui.current_weather

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ahoy.weatherapp.data.MyLocation
import com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase
import kotlinx.coroutines.launch

class CurrentWeatherViewModel @ViewModelInject constructor(
    private val getCurrentWeatherUseCase: GetCurrentWeatherUseCase,
    myLocation: MyLocation
) : ViewModel() {

    private val _uiState: MutableLiveData<CurrentWeatherViewState> = MutableLiveData()
    val uiState: LiveData<CurrentWeatherViewState>
        get() = _uiState

    init {
        _uiState.value = CurrentWeatherViewState(isLoading = true)
        myLocation.setLocationCallback {
            getCurrentWeather(it)
        }
    }

    private fun getCurrentWeather(city: String) = viewModelScope.launch {
        try {
            val result = getCurrentWeatherUseCase.invoke(city)
            _uiState.value = CurrentWeatherViewState(
                isLoading = false,
                currentWeather = result
            )
        } catch (e: Exception) {
            _uiState.value = CurrentWeatherViewState(
                anyError = true,
                errorMessage = e.message ?: "An error occurred.",
                isLoading = false
            )
        }
    }
}