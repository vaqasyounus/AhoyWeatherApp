package com.example.ahoy.weatherapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<String> bASE_URLProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitFactory(Provider<String> bASE_URLProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.bASE_URLProvider = bASE_URLProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(bASE_URLProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(Provider<String> bASE_URLProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(bASE_URLProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(String BASE_URL, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideRetrofit(BASE_URL, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
