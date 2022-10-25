package com.example.ahoy.weatherapp.ui.current_weather;

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
    topLevelClass = CurrentWeatherViewModel.class
)
public interface CurrentWeatherViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      CurrentWeatherViewModel_AssistedFactory factory);
}
