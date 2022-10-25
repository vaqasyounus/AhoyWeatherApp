package com.example.ahoy.weatherapp.ui.current_weather;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.ahoy.weatherapp.data.MyLocation;
import com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CurrentWeatherViewModel_AssistedFactory implements ViewModelAssistedFactory<CurrentWeatherViewModel> {
  private final Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCase;

  private final Provider<MyLocation> myLocation;

  @Inject
  CurrentWeatherViewModel_AssistedFactory(
      Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCase,
      Provider<MyLocation> myLocation) {
    this.getCurrentWeatherUseCase = getCurrentWeatherUseCase;
    this.myLocation = myLocation;
  }

  @Override
  @NonNull
  public CurrentWeatherViewModel create(SavedStateHandle arg0) {
    return new CurrentWeatherViewModel(getCurrentWeatherUseCase.get(), myLocation.get());
  }
}
