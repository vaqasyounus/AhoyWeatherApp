package com.example.ahoy.weatherapp.core

import org.junit.Assert.*

import org.junit.Test

class WeatherUtilsTest {

    @Test
    fun convertTimestampToDate() {
        assertEquals("Updated at: 25-10-2022",WeatherUtils.convertTimestampToDate(1666723627))

    }
}