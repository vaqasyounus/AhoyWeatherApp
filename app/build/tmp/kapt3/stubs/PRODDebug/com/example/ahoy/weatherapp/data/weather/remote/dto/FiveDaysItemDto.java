package com.example.ahoy.weatherapp.data.weather.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\fH\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/remote/dto/FiveDaysItemDto;", "", "dt", "", "dtTxt", "", "main", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;", "weather", "", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WeatherDto;", "wind", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;", "(ILjava/lang/String;Lcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;Ljava/util/List;Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;)V", "getDt", "()I", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_PRODDebug"})
public final class FiveDaysItemDto {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> weather = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto wind = null;
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto getWind() {
        return null;
    }
    
    public FiveDaysItemDto(int dt, @org.jetbrains.annotations.NotNull()
    java.lang.String dtTxt, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> weather, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto wind) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto copy(int dt, @org.jetbrains.annotations.NotNull()
    java.lang.String dtTxt, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> weather, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto wind) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}