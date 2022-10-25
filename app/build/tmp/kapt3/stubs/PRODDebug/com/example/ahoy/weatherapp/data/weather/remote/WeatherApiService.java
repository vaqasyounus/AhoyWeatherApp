package com.example.ahoy.weatherapp.data.weather.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ/\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherApiService;", "", "getCurrentWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/CurrentWeatherResponse;", "location", "", "unitSystem", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastFiveDaysWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/FiveDaysWeatherResponse;", "app_PRODDebug"})
public abstract interface WeatherApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "forecast")
    public abstract java.lang.Object getLastFiveDaysWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse> p3);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}