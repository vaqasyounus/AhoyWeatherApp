package com.example.ahoy.weatherapp.di;

import com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource;
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideWeatherRepositoryFactory implements Factory<WeatherRepository> {
  private final Provider<WeatherRemoteDataSource> remoteDataSourceProvider;

  public RepositoryModule_ProvideWeatherRepositoryFactory(
      Provider<WeatherRemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public WeatherRepository get() {
    return provideWeatherRepository(remoteDataSourceProvider.get());
  }

  public static RepositoryModule_ProvideWeatherRepositoryFactory create(
      Provider<WeatherRemoteDataSource> remoteDataSourceProvider) {
    return new RepositoryModule_ProvideWeatherRepositoryFactory(remoteDataSourceProvider);
  }

  public static WeatherRepository provideWeatherRepository(
      WeatherRemoteDataSource remoteDataSource) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideWeatherRepository(remoteDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
