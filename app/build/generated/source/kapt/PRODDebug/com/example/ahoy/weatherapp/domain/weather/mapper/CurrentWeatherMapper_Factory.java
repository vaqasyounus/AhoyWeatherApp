package com.example.ahoy.weatherapp.domain.weather.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrentWeatherMapper_Factory implements Factory<CurrentWeatherMapper> {
  @Override
  public CurrentWeatherMapper get() {
    return newInstance();
  }

  public static CurrentWeatherMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CurrentWeatherMapper newInstance() {
    return new CurrentWeatherMapper();
  }

  private static final class InstanceHolder {
    private static final CurrentWeatherMapper_Factory INSTANCE = new CurrentWeatherMapper_Factory();
  }
}
