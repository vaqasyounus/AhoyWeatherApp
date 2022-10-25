package com.example.ahoy.weatherapp.ui.five_days_weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "getFiveDaysWeatherUseCase", "Lcom/example/ahoy/weatherapp/domain/weather/usecase/GetFiveDaysWeatherUseCase;", "(Lcom/example/ahoy/weatherapp/domain/weather/usecase/GetFiveDaysWeatherUseCase;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherViewState;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "getFiveDaysWeather", "Lkotlinx/coroutines/Job;", "app_PRODDebug"})
public final class FiveDaysWeatherViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewState> _uiState = null;
    private final com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase getFiveDaysWeatherUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewState> getUiState() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getFiveDaysWeather() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FiveDaysWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase getFiveDaysWeatherUseCase) {
        super();
    }
}