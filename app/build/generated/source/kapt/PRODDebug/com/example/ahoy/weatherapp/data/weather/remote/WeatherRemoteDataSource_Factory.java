package com.example.ahoy.weatherapp.data.weather.remote;

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
public final class WeatherRemoteDataSource_Factory implements Factory<WeatherRemoteDataSource> {
  private final Provider<WeatherApiService> weatherApiServiceProvider;

  public WeatherRemoteDataSource_Factory(Provider<WeatherApiService> weatherApiServiceProvider) {
    this.weatherApiServiceProvider = weatherApiServiceProvider;
  }

  @Override
  public WeatherRemoteDataSource get() {
    return newInstance(weatherApiServiceProvider.get());
  }

  public static WeatherRemoteDataSource_Factory create(
      Provider<WeatherApiService> weatherApiServiceProvider) {
    return new WeatherRemoteDataSource_Factory(weatherApiServiceProvider);
  }

  public static WeatherRemoteDataSource newInstance(WeatherApiService weatherApiService) {
    return new WeatherRemoteDataSource(weatherApiService);
  }
}
