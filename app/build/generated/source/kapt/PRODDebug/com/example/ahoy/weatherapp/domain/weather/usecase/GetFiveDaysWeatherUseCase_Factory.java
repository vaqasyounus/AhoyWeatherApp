package com.example.ahoy.weatherapp.domain.weather.usecase;

import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider;
import com.example.ahoy.weatherapp.domain.weather.mapper.FiveDaysWeatherMapper;
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
public final class GetFiveDaysWeatherUseCase_Factory implements Factory<GetFiveDaysWeatherUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  private final Provider<FiveDaysWeatherMapper> fiveDaysWeatherMapperProvider;

  private final Provider<UnitProvider> unitProvider;

  public GetFiveDaysWeatherUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<FiveDaysWeatherMapper> fiveDaysWeatherMapperProvider,
      Provider<UnitProvider> unitProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
    this.fiveDaysWeatherMapperProvider = fiveDaysWeatherMapperProvider;
    this.unitProvider = unitProvider;
  }

  @Override
  public GetFiveDaysWeatherUseCase get() {
    return newInstance(weatherRepositoryProvider.get(), fiveDaysWeatherMapperProvider.get(), unitProvider.get());
  }

  public static GetFiveDaysWeatherUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider,
      Provider<FiveDaysWeatherMapper> fiveDaysWeatherMapperProvider,
      Provider<UnitProvider> unitProvider) {
    return new GetFiveDaysWeatherUseCase_Factory(weatherRepositoryProvider, fiveDaysWeatherMapperProvider, unitProvider);
  }

  public static GetFiveDaysWeatherUseCase newInstance(WeatherRepository weatherRepository,
      FiveDaysWeatherMapper fiveDaysWeatherMapper, UnitProvider unitProvider) {
    return new GetFiveDaysWeatherUseCase(weatherRepository, fiveDaysWeatherMapper, unitProvider);
  }
}
