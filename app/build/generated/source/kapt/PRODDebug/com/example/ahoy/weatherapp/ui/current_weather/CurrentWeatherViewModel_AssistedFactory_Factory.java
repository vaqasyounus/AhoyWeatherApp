package com.example.ahoy.weatherapp.ui.current_weather;

import com.example.ahoy.weatherapp.data.MyLocation;
import com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase;
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
public final class CurrentWeatherViewModel_AssistedFactory_Factory implements Factory<CurrentWeatherViewModel_AssistedFactory> {
  private final Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider;

  private final Provider<MyLocation> myLocationProvider;

  public CurrentWeatherViewModel_AssistedFactory_Factory(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider,
      Provider<MyLocation> myLocationProvider) {
    this.getCurrentWeatherUseCaseProvider = getCurrentWeatherUseCaseProvider;
    this.myLocationProvider = myLocationProvider;
  }

  @Override
  public CurrentWeatherViewModel_AssistedFactory get() {
    return newInstance(getCurrentWeatherUseCaseProvider, myLocationProvider);
  }

  public static CurrentWeatherViewModel_AssistedFactory_Factory create(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider,
      Provider<MyLocation> myLocationProvider) {
    return new CurrentWeatherViewModel_AssistedFactory_Factory(getCurrentWeatherUseCaseProvider, myLocationProvider);
  }

  public static CurrentWeatherViewModel_AssistedFactory newInstance(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCase,
      Provider<MyLocation> myLocation) {
    return new CurrentWeatherViewModel_AssistedFactory(getCurrentWeatherUseCase, myLocation);
  }
}
