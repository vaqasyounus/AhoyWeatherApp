package com.example.ahoy.weatherapp.data.weather.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/remote/response/FiveDaysWeatherResponse;", "", "city", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CityDto;", "cod", "", "list", "", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/FiveDaysItemDto;", "message", "", "(Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CityDto;Ljava/lang/String;Ljava/util/List;I)V", "getCity", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CityDto;", "getCod", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getMessage", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_PRODDebug"})
public final class FiveDaysWeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto city = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final java.lang.String cod = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "list")
    private final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto> list = null;
    @com.google.gson.annotations.SerializedName(value = "message")
    private final int message = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto> getList() {
        return null;
    }
    
    public final int getMessage() {
        return 0;
    }
    
    public FiveDaysWeatherResponse(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto city, @org.jetbrains.annotations.NotNull()
    java.lang.String cod, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto> list, int message) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.response.FiveDaysWeatherResponse copy(@org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CityDto city, @org.jetbrains.annotations.NotNull()
    java.lang.String cod, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.FiveDaysItemDto> list, int message) {
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