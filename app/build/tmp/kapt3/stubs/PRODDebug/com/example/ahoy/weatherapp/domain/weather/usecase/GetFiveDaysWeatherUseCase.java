package com.example.ahoy.weatherapp.domain.weather.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\u00020\rH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ahoy/weatherapp/domain/weather/usecase/GetFiveDaysWeatherUseCase;", "", "weatherRepository", "Lcom/example/ahoy/weatherapp/domain/weather/repository/WeatherRepository;", "fiveDaysWeatherMapper", "Lcom/example/ahoy/weatherapp/domain/weather/mapper/FiveDaysWeatherMapper;", "unitProvider", "Lcom/example/ahoy/weatherapp/data/weather/shared_preferences/UnitProvider;", "(Lcom/example/ahoy/weatherapp/domain/weather/repository/WeatherRepository;Lcom/example/ahoy/weatherapp/domain/weather/mapper/FiveDaysWeatherMapper;Lcom/example/ahoy/weatherapp/data/weather/shared_preferences/UnitProvider;)V", "location", "", "unitSystem", "invoke", "Lcom/example/ahoy/weatherapp/domain/weather/model/FiveDaysWeather;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_PRODDebug"})
public final class GetFiveDaysWeatherUseCase {
    private final java.lang.String location = null;
    private final java.lang.String unitSystem = null;
    private final com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository weatherRepository = null;
    private final com.example.ahoy.weatherapp.domain.weather.mapper.FiveDaysWeatherMapper fiveDaysWeatherMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.domain.weather.model.FiveDaysWeather> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetFiveDaysWeatherUseCase(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository weatherRepository, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.domain.weather.mapper.FiveDaysWeatherMapper fiveDaysWeatherMapper, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider unitProvider) {
        super();
    }
}