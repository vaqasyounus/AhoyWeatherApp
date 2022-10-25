package com.example.ahoy.weatherapp.data.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/WeatherRepositoryImpl;", "Lcom/example/ahoy/weatherapp/domain/weather/repository/WeatherRepository;", "remoteDataSource", "Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherRemoteDataSource;", "(Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherRemoteDataSource;)V", "fetchCurrentWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/CurrentWeatherResponse;", "location", "", "unitSystem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFiveDaysWeather", "Lcom/example/ahoy/weatherapp/data/weather/remote/response/FiveDaysWeatherResponse;", "app_PRODDebug"})
public final class WeatherRepositoryImpl implements com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository {
    private final com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchFiveDaysWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String unitSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource remoteDataSource) {
        super();
    }
}