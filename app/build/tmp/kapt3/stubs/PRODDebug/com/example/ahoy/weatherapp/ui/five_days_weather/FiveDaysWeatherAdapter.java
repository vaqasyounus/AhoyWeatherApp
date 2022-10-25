package com.example.ahoy.weatherapp.ui.five_days_weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherAdapter$FiveDaysViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/ahoy/weatherapp/domain/weather/model/FiveDaysItem;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FiveDaysViewHolder", "app_PRODDebug"})
public final class FiveDaysWeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherAdapter.FiveDaysViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem> differCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem> differ = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.ahoy.weatherapp.domain.weather.model.FiveDaysItem> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherAdapter.FiveDaysViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.ui.five_days_weather.FiveDaysWeatherAdapter.FiveDaysViewHolder holder, int position) {
    }
    
    public FiveDaysWeatherAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherAdapter$FiveDaysViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/ahoy/weatherapp/databinding/ItemFivedaysWeatherBinding;", "(Lcom/example/ahoy/weatherapp/ui/five_days_weather/FiveDaysWeatherAdapter;Lcom/example/ahoy/weatherapp/databinding/ItemFivedaysWeatherBinding;)V", "getBinding", "()Lcom/example/ahoy/weatherapp/databinding/ItemFivedaysWeatherBinding;", "app_PRODDebug"})
    public final class FiveDaysViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.ahoy.weatherapp.databinding.ItemFivedaysWeatherBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ahoy.weatherapp.databinding.ItemFivedaysWeatherBinding getBinding() {
            return null;
        }
        
        public FiveDaysViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.ahoy.weatherapp.databinding.ItemFivedaysWeatherBinding binding) {
            super(null);
        }
    }
}