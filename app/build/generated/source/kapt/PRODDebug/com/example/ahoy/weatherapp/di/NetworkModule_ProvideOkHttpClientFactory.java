package com.example.ahoy.weatherapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggerProvider;

  public NetworkModule_ProvideOkHttpClientFactory(Provider<HttpLoggingInterceptor> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(loggerProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggerProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(loggerProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor logger) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideOkHttpClient(logger), "Cannot return null from a non-@Nullable @Provides method");
  }
}
