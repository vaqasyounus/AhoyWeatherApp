package com.example.ahoy.weatherapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor();
  }

  public static NetworkModule_ProvideLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideLoggingInterceptorFactory INSTANCE = new NetworkModule_ProvideLoggingInterceptorFactory();
  }
}
