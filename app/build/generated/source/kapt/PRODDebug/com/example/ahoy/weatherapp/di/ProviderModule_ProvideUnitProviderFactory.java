package com.example.ahoy.weatherapp.di;

import android.content.Context;
import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider;
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
public final class ProviderModule_ProvideUnitProviderFactory implements Factory<UnitProvider> {
  private final Provider<Context> contextProvider;

  public ProviderModule_ProvideUnitProviderFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UnitProvider get() {
    return provideUnitProvider(contextProvider.get());
  }

  public static ProviderModule_ProvideUnitProviderFactory create(
      Provider<Context> contextProvider) {
    return new ProviderModule_ProvideUnitProviderFactory(contextProvider);
  }

  public static UnitProvider provideUnitProvider(Context context) {
    return Preconditions.checkNotNull(ProviderModule.INSTANCE.provideUnitProvider(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
