package com.example.ahoy.weatherapp.ui.five_days_weather;

import com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase;
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
public final class FiveDaysWeatherViewModel_AssistedFactory_Factory implements Factory<FiveDaysWeatherViewModel_AssistedFactory> {
  private final Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCaseProvider;

  public FiveDaysWeatherViewModel_AssistedFactory_Factory(
      Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCaseProvider) {
    this.getFiveDaysWeatherUseCaseProvider = getFiveDaysWeatherUseCaseProvider;
  }

  @Override
  public FiveDaysWeatherViewModel_AssistedFactory get() {
    return newInstance(getFiveDaysWeatherUseCaseProvider);
  }

  public static FiveDaysWeatherViewModel_AssistedFactory_Factory create(
      Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCaseProvider) {
    return new FiveDaysWeatherViewModel_AssistedFactory_Factory(getFiveDaysWeatherUseCaseProvider);
  }

  public static FiveDaysWeatherViewModel_AssistedFactory newInstance(
      Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCase) {
    return new FiveDaysWeatherViewModel_AssistedFactory(getFiveDaysWeatherUseCase);
  }
}
