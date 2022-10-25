package com.example.ahoy.weatherapp.ui.five_days_weather;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = FiveDaysWeatherViewModel.class
)
public interface FiveDaysWeatherViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      FiveDaysWeatherViewModel_AssistedFactory factory);
}
