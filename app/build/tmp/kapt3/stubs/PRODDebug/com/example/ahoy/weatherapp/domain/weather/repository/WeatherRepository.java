package com.example.ahoy.weatherapp.domain.weather.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/ahoy/weatherapp/domain/weather/repository/WeatherRepository;", "", "fetchCurrentWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/CurrentWeatherResponse;", "location", "", "unitSystem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFiveDaysWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/FiveDaysWeatherResponse;", "app_PRODDebug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchFiveDaysWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse> p2);
}