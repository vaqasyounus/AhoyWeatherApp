package com.example.ahoy.weatherapp.data.weather.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherRemoteDataSource;", "", "weatherApiService", "Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherApiService;", "(Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherApiService;)V", "fetchCurrentWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/CurrentWeatherResponse;", "location", "", "unitSystem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFiveDaysWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/FiveDaysWeatherResponse;", "app_PRODDebug"})
public final class WeatherRemoteDataSource {
    private final com.example.ahoy.weatherapp.data.weather.remote.WeatherApiService weatherApiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchFiveDaysWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.WeatherApiService weatherApiService) {
        super();
    }
}