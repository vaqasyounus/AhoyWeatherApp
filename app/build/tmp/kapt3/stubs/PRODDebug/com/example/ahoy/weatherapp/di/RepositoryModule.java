package com.example.ahoy.weatherapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ahoy/weatherapp/di/RepositoryModule;", "", "()V", "provideWeatherRepository", "Lcom/example/ahoy/weatherapp/domain/weather/repository/WeatherRepository;", "remoteDataSource", "Lcom/example/ahoy/weatherapp/data/weather/remote/WeatherRemoteDataSource;", "app_PRODDebug"})
@dagger.Module()
public final class RepositoryModule {
    public static final com.example.ahoy.weatherapp.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource remoteDataSource) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}