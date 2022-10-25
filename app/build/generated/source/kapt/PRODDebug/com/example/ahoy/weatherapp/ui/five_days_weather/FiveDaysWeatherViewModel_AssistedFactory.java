package com.example.ahoy.weatherapp.ui.five_days_weather;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FiveDaysWeatherViewModel_AssistedFactory implements ViewModelAssistedFactory<FiveDaysWeatherViewModel> {
  private final Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCase;

  @Inject
  FiveDaysWeatherViewModel_AssistedFactory(
      Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCase) {
    this.getFiveDaysWeatherUseCase = getFiveDaysWeatherUseCase;
  }

  @Override
  @NonNull
  public FiveDaysWeatherViewModel create(SavedStateHandle arg0) {
    return new FiveDaysWeatherViewModel(getFiveDaysWeatherUseCase.get());
  }
}
