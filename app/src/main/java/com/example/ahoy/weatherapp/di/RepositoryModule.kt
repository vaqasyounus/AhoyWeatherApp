package com.example.ahoy.weatherapp.di

import com.example.ahoy.weatherapp.data.weather.WeatherRepositoryImpl
import com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Provides
    fun provideWeatherRepository(
        remoteDataSource: WeatherRemoteDataSource
    ):WeatherRepository{
        return WeatherRepositoryImpl(remoteDataSource)
    }
}