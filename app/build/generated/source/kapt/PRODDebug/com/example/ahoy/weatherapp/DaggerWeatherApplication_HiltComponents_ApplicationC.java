package com.example.ahoy.weatherapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.ahoy.weatherapp.data.MyLocation;
import com.example.ahoy.weatherapp.data.weather.remote.WeatherApiService;
import com.example.ahoy.weatherapp.data.weather.remote.WeatherRemoteDataSource;
import com.example.ahoy.weatherapp.data.weather.shared_preferences.UnitProvider;
import com.example.ahoy.weatherapp.di.NetworkModule;
import com.example.ahoy.weatherapp.di.NetworkModule_ProvideApiServiceFactory;
import com.example.ahoy.weatherapp.di.NetworkModule_ProvideBaseUrlFactory;
import com.example.ahoy.weatherapp.di.NetworkModule_ProvideLoggingInterceptorFactory;
import com.example.ahoy.weatherapp.di.NetworkModule_ProvideOkHttpClientFactory;
import com.example.ahoy.weatherapp.di.NetworkModule_ProvideRetrofitFactory;
import com.example.ahoy.weatherapp.di.ProviderModule;
import com.example.ahoy.weatherapp.di.ProviderModule_ProvideLocationFactory;
import com.example.ahoy.weatherapp.di.ProviderModule_ProvideUnitProviderFactory;
import com.example.ahoy.weatherapp.di.RepositoryModule;
import com.example.ahoy.weatherapp.di.RepositoryModule_ProvideWeatherRepositoryFactory;
import com.example.ahoy.weatherapp.domain.weather.mapper.CurrentWeatherMapper;
import com.example.ahoy.weatherapp.domain.weather.mapper.FiveDaysWeatherMapper;
import com.example.ahoy.weatherapp.domain.weather.repository.WeatherRepository;
import com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase;
import com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase;
import com.example.ahoy.weatherapp.ui.MainActivity;
import com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherFragment;
import com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewModel_AssistedFactory;
import com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewModel_AssistedFactory_Factory;
import com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherFragment;
import com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewModel_AssistedFactory;
import com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerWeatherApplication_HiltComponents_ApplicationC extends WeatherApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object weatherApiService = new MemoizedSentinel();

  private volatile Object unitProvider = new MemoizedSentinel();

  private volatile Object myLocation = new MemoizedSentinel();

  private volatile Provider<MyLocation> provideLocationProvider;

  private DaggerWeatherApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    return NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(NetworkModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor());
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitFactory.provideRetrofit(NetworkModule_ProvideBaseUrlFactory.provideBaseUrl(), getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private WeatherApiService getWeatherApiService() {
    Object local = weatherApiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = weatherApiService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideApiServiceFactory.provideApiService(getRetrofit());
          weatherApiService = DoubleCheck.reentrantCheck(weatherApiService, local);
        }
      }
    }
    return (WeatherApiService) local;
  }

  private WeatherRemoteDataSource getWeatherRemoteDataSource() {
    return new WeatherRemoteDataSource(getWeatherApiService());
  }

  private WeatherRepository getWeatherRepository() {
    return RepositoryModule_ProvideWeatherRepositoryFactory.provideWeatherRepository(getWeatherRemoteDataSource());
  }

  private UnitProvider getUnitProvider() {
    Object local = unitProvider;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = unitProvider;
        if (local instanceof MemoizedSentinel) {
          local = ProviderModule_ProvideUnitProviderFactory.provideUnitProvider(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          unitProvider = DoubleCheck.reentrantCheck(unitProvider, local);
        }
      }
    }
    return (UnitProvider) local;
  }

  private MyLocation getMyLocation() {
    Object local = myLocation;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = myLocation;
        if (local instanceof MemoizedSentinel) {
          local = ProviderModule_ProvideLocationFactory.provideLocation(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          myLocation = DoubleCheck.reentrantCheck(myLocation, local);
        }
      }
    }
    return (MyLocation) local;
  }

  private Provider<MyLocation> getMyLocationProvider() {
    Object local = provideLocationProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideLocationProvider = (Provider<MyLocation>) local;
    }
    return (Provider<MyLocation>) local;
  }

  @Override
  public void injectWeatherApplication(WeatherApplication weatherApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder providerModule(ProviderModule providerModule) {
      Preconditions.checkNotNull(providerModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public WeatherApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerWeatherApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements WeatherApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public WeatherApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends WeatherApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements WeatherApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public WeatherApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends WeatherApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GetCurrentWeatherUseCase> getCurrentWeatherUseCaseProvider;

      private volatile Provider<CurrentWeatherViewModel_AssistedFactory> currentWeatherViewModel_AssistedFactoryProvider;

      private volatile Provider<GetFiveDaysWeatherUseCase> getFiveDaysWeatherUseCaseProvider;

      private volatile Provider<FiveDaysWeatherViewModel_AssistedFactory> fiveDaysWeatherViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private GetCurrentWeatherUseCase getGetCurrentWeatherUseCase() {
        return new GetCurrentWeatherUseCase(DaggerWeatherApplication_HiltComponents_ApplicationC.this.getWeatherRepository(), new CurrentWeatherMapper(), DaggerWeatherApplication_HiltComponents_ApplicationC.this.getUnitProvider());
      }

      private Provider<GetCurrentWeatherUseCase> getGetCurrentWeatherUseCaseProvider() {
        Object local = getCurrentWeatherUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          getCurrentWeatherUseCaseProvider = (Provider<GetCurrentWeatherUseCase>) local;
        }
        return (Provider<GetCurrentWeatherUseCase>) local;
      }

      private CurrentWeatherViewModel_AssistedFactory getCurrentWeatherViewModel_AssistedFactory() {
        return CurrentWeatherViewModel_AssistedFactory_Factory.newInstance(getGetCurrentWeatherUseCaseProvider(), DaggerWeatherApplication_HiltComponents_ApplicationC.this.getMyLocationProvider());
      }

      private Provider<CurrentWeatherViewModel_AssistedFactory> getCurrentWeatherViewModel_AssistedFactoryProvider(
          ) {
        Object local = currentWeatherViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          currentWeatherViewModel_AssistedFactoryProvider = (Provider<CurrentWeatherViewModel_AssistedFactory>) local;
        }
        return (Provider<CurrentWeatherViewModel_AssistedFactory>) local;
      }

      private GetFiveDaysWeatherUseCase getGetFiveDaysWeatherUseCase() {
        return new GetFiveDaysWeatherUseCase(DaggerWeatherApplication_HiltComponents_ApplicationC.this.getWeatherRepository(), new FiveDaysWeatherMapper(), DaggerWeatherApplication_HiltComponents_ApplicationC.this.getUnitProvider());
      }

      private Provider<GetFiveDaysWeatherUseCase> getGetFiveDaysWeatherUseCaseProvider() {
        Object local = getFiveDaysWeatherUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          getFiveDaysWeatherUseCaseProvider = (Provider<GetFiveDaysWeatherUseCase>) local;
        }
        return (Provider<GetFiveDaysWeatherUseCase>) local;
      }

      private FiveDaysWeatherViewModel_AssistedFactory getFiveDaysWeatherViewModel_AssistedFactory(
          ) {
        return FiveDaysWeatherViewModel_AssistedFactory_Factory.newInstance(getGetFiveDaysWeatherUseCaseProvider());
      }

      private Provider<FiveDaysWeatherViewModel_AssistedFactory> getFiveDaysWeatherViewModel_AssistedFactoryProvider(
          ) {
        Object local = fiveDaysWeatherViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          fiveDaysWeatherViewModel_AssistedFactoryProvider = (Provider<FiveDaysWeatherViewModel_AssistedFactory>) local;
        }
        return (Provider<FiveDaysWeatherViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewModel", (Provider) getCurrentWeatherViewModel_AssistedFactoryProvider()).put("com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewModel", (Provider) getFiveDaysWeatherViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWeatherApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements WeatherApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public WeatherApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends WeatherApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWeatherApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectCurrentWeatherFragment(CurrentWeatherFragment currentWeatherFragment) {
        }

        @Override
        public void injectFiveDaysWeatherFragment(FiveDaysWeatherFragment fiveDaysWeatherFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements WeatherApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public WeatherApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends WeatherApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements WeatherApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public WeatherApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends WeatherApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.ahoy.weatherapp.ui.current_weather.CurrentWeatherViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getCurrentWeatherViewModel_AssistedFactory();

            case 1: // com.example.ahoy.weatherapp.domain.weather.usecase.GetCurrentWeatherUseCase 
            return (T) ActivityCImpl.this.getGetCurrentWeatherUseCase();

            case 2: // com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFiveDaysWeatherViewModel_AssistedFactory();

            case 3: // com.example.ahoy.weatherapp.domain.weather.usecase.GetFiveDaysWeatherUseCase 
            return (T) ActivityCImpl.this.getGetFiveDaysWeatherUseCase();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements WeatherApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends WeatherApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.ahoy.weatherapp.data.MyLocation 
        return (T) DaggerWeatherApplication_HiltComponents_ApplicationC.this.getMyLocation();

        default: throw new AssertionError(id);
      }
    }
  }
}
