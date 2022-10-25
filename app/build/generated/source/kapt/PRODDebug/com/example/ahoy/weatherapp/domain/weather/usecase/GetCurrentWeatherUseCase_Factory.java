package com.example.ahoy.weatherapp.domain.weather.usecase;

import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider;
import com.example.ahoy.weatherapp.domain.weather.mapper.CurrentWeatherMapper;
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCurrentWeatherUseCase_Factory implements Factory<GetCurrentWeatherUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  private final Provider<CurrentWeatherMapper> currentWeatherMapperProvider;

  private final Provider<UnitProvider> unitProvider;

  public GetCurrentWeatherUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<CurrentWeatherMapper> currentWeatherMapperProvider,
      Provider<UnitProvider> unitProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
    this.currentWeatherMapperProvider = currentWeatherMapperProvider;
    this.unitProvider = unitProvider;
  }

  @Override
  public GetCurrentWeatherUseCase get() {
    return newInstance(weatherRepositoryProvider.get(), currentWeatherMapperProvider.get(), unitProvider.get());
  }

  public static GetCurrentWeatherUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<CurrentWeatherMapper> currentWeatherMapperProvider,
      Provider<UnitProvider> unitProvider) {
    return new GetCurrentWeatherUseCase_Factory(weatherRepositoryProvider, currentWeatherMapperProvider, unitProvider);
  }

  public static GetCurrentWeatherUseCase newInstance(WeatherRepository weatherRepository,
      CurrentWeatherMapper currentWeatherMapper, UnitProvider unitProvider) {
    return new GetCurrentWeatherUseCase(weatherRepository, currentWeatherMapper, unitProvider);
  }
}
