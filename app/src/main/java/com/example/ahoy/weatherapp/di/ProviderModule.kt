package com.example.ahoy.weatherapp.di

import android.content.Context
import com.example.ahoy.weatherapp.data.MyLocation
import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ProviderModule {

    @Singleton
    @Provides
    fun provideUnitProvider(
        @ApplicationContext context: Context
    ) = UnitProvider(context)


    @Singleton
    @Provides
    fun provideLocation(
        @ApplicationContext context: Context
    ): MyLocation {
        return MyLocation(context)
    }

}