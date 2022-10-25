package com.example.ahoy.weatherapp.data.weather;

import com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource;
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
public final class WeatherRepositoryImpl_Factory implements Factory<WeatherRepositoryImpl> {
  private final Provider<WeatherRemoteDataSource> remoteDataSourceProvider;

  public WeatherRepositoryImpl_Factory(Provider<WeatherRemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public WeatherRepositoryImpl get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static WeatherRepositoryImpl_Factory create(
      Provider<WeatherRemoteDataSource> remoteDataSourceProvider) {
    return new WeatherRepositoryImpl_Factory(remoteDataSourceProvider);
  }

  public static WeatherRepositoryImpl newInstance(WeatherRemoteDataSource remoteDataSource) {
    return new WeatherRepositoryImpl(remoteDataSource);
  }
}
