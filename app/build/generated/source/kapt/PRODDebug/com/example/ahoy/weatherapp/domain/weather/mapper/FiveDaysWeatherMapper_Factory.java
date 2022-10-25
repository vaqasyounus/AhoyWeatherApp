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
public final class FiveDaysWeatherMapper_Factory implements Factory<FiveDaysWeatherMapper> {
  @Override
  public FiveDaysWeatherMapper get() {
    return newInstance();
  }

  public static FiveDaysWeatherMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FiveDaysWeatherMapper newInstance() {
    return new FiveDaysWeatherMapper();
  }

  private static final class InstanceHolder {
    private static final FiveDaysWeatherMapper_Factory INSTANCE = new FiveDaysWeatherMapper_Factory();
  }
}
