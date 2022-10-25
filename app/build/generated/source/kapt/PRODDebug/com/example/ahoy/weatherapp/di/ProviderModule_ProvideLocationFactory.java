package com.example.ahoy.weatherapp.di;

import android.content.Context;
import com.example.ahoy.weatherapp.data.MyLocation;
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
public final class ProviderModule_ProvideLocationFactory implements Factory<MyLocation> {
  private final Provider<Context> contextProvider;

  public ProviderModule_ProvideLocationFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MyLocation get() {
    return provideLocation(contextProvider.get());
  }

  public static ProviderModule_ProvideLocationFactory create(Provider<Context> contextProvider) {
    return new ProviderModule_ProvideLocationFactory(contextProvider);
  }

  public static MyLocation provideLocation(Context context) {
    return Preconditions.checkNotNull(ProviderModule.INSTANCE.provideLocation(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
