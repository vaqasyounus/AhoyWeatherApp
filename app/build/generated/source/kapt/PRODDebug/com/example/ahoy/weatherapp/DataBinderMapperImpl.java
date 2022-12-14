package com.example.ahoy.weatherapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.ahoy.weatherapp.databinding.FragmentCurrentWeatherBindingImpl;
import com.example.ahoy.weatherapp.databinding.FragmentFiveDaysWeatherBindingImpl;
import com.example.ahoy.weatherapp.databinding.ItemFivedaysWeatherBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCURRENTWEATHER = 1;

  private static final int LAYOUT_FRAGMENTFIVEDAYSWEATHER = 2;

  private static final int LAYOUT_ITEMFIVEDAYSWEATHER = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahoy.weatherapp.R.layout.fragment_current_weather, LAYOUT_FRAGMENTCURRENTWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahoy.weatherapp.R.layout.fragment_five_days_weather, LAYOUT_FRAGMENTFIVEDAYSWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ahoy.weatherapp.R.layout.item_fivedays_weather, LAYOUT_ITEMFIVEDAYSWEATHER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCURRENTWEATHER: {
          if ("layout/fragment_current_weather_0".equals(tag)) {
            return new FragmentCurrentWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_current_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFIVEDAYSWEATHER: {
          if ("layout/fragment_five_days_weather_0".equals(tag)) {
            return new FragmentFiveDaysWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_five_days_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFIVEDAYSWEATHER: {
          if ("layout/item_fivedays_weather_0".equals(tag)) {
            return new ItemFivedaysWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_fivedays_weather is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "fiveDayItem");
      sKeys.put(2, "uiState");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_current_weather_0", com.example.ahoy.weatherapp.R.layout.fragment_current_weather);
      sKeys.put("layout/fragment_five_days_weather_0", com.example.ahoy.weatherapp.R.layout.fragment_five_days_weather);
      sKeys.put("layout/item_fivedays_weather_0", com.example.ahoy.weatherapp.R.layout.item_fivedays_weather);
    }
  }
}
