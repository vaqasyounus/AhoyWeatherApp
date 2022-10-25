package com.example.ahoy.weatherapp.data.weather.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0015H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\fH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u000fH\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J}\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0005H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006;"}, d2 = {"Lcom/example/ahoy/weatherapp/data/weather/remote/response/CurrentWeatherResponse;", "", "base", "", "cod", "", "coordinate", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CoordinateDto;", "timestamp", "", "id", "main", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;", "name", "countryInfo", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CountryInfoDto;", "visibility", "weather", "", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WeatherDto;", "wind", "Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;", "(Ljava/lang/String;ILcom/example/ahoy/weatherapp/data/weather/remote/dto/CoordinateDto;JILcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;Ljava/lang/String;Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CountryInfoDto;ILjava/util/List;Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;)V", "getBase", "()Ljava/lang/String;", "getCod", "()I", "getCoordinate", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CoordinateDto;", "getCountryInfo", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/CountryInfoDto;", "getId", "getMain", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/MainDto;", "getName", "getTimestamp", "()J", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/ahoy/weatherapp/data/weather/remote/dto/WindDto;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_PRODDebug"})
public final class CurrentWeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "base")
    private final java.lang.String base = null;
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final int cod = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "coord")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.CoordinateDto coordinate = null;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final long timestamp = 0L;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sys")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.CountryInfoDto countryInfo = null;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> weather = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wind")
    private final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto wind = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CoordinateDto getCoordinate() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CountryInfoDto getCountryInfo() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto getWind() {
        return null;
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String base, int cod, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CoordinateDto coordinate, long timestamp, int id, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CountryInfoDto countryInfo, int visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> weather, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto wind) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CoordinateDto component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.CountryInfoDto component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ahoy.weatherapp.data.weather.remote.dto.WeatherDto> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.dto.WindDto component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ahoy.weatherapp.data.weather.remote.response.CurrentWeatherResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String base, int cod, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CoordinateDto coordinate, long timestamp, int id, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.MainDto main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.ahoy.weatherapp.data.weather.remote.dto.CountryInfoDto countryInfo, int visibility, @org.jetbrains.annotations.NotNull()
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