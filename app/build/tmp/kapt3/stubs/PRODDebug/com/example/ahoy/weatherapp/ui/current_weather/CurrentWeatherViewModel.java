package com.example.ahoy.weatherapp.ui.current_weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/ahoy/weatherapp/ui/current_weather/CurrentWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrentWeatherUseCase", "Lcom/example/ahoy/weatherapp/domain/weather/usecase/GetCurrentWeatherUseCase;", "myLocation", "Lcom/example/ahoy/weatherapp/data/MyLocation;", "(Lcom/example/ahoy/weatherapp/domain/weather/usecase/GetCurrentWeatherUseCase;Lcom/example/ahoy/weatherapp/data/MyLocation;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/ahoy/weatherapp/ui/current_weather/CurrentWeatherViewState;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "getCurrentWeather", "Lkotlinx/coroutines/Job;", "city", "", "app_PRODDebug"})
public final class CurrentWeatherViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewState> _uiState = null;
    private final com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase getCurrentWeatherUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewState> getUiState() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getCurrentWeather(java.lang.String city) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public CurrentWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase getCurrentWeatherUseCase, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.MyLocation myLocation) {
        super();
    }
}