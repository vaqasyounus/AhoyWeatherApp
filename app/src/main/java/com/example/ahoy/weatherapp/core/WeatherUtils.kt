package com.example.ahoy.weatherapp.core

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.text.format.DateFormat
import androidx.core.app.ActivityCompat
import java.util.*


object WeatherUtils {

    fun convertTimestampToDate(timestamp: Long): String {
        val calendar = Calendar.getInstance(Locale.ENGLISH)
        calendar.timeInMillis = timestamp * 1000L
        val date = DateFormat.format("dd-MM-yyyy", calendar).toString()
        return "Updated at: ${date}"
    }


    fun getHourAndMinute(timestamp: Long): String {
        val calendar = Calendar.getInstance(Locale.ENGLISH)
        calendar.timeInMillis = timestamp * 1000L
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        return "${hour}:${minute}"
    }


    fun getTemp(temp: Double, unitSystem: String): String {
        return if (unitSystem == "METRIC")
            "$temp ℃"
        else "$temp °F"
    }


    fun getMinTemp(temp: Double, unitSystem: String): String {
        return if (unitSystem == "Metric")
            "Min temp: $temp ℃"
        else "Min temp: $temp °F"
    }


    fun getMaxTemp(temp: Double, unitSystem: String): String {
        return if (unitSystem == "Metric")
            "Max temp: $temp ℃"
        else "Max temp: $temp °F"
    }

    fun getWindSpeed(speed: String): String {
        return "$speed m/s"
    }

    fun getPressure(pressure: Int): String {
        return "$pressure hPa"
    }

    fun getHumidity(pressure: String): String {
        return "$pressure %"
    }

    fun locationToCity(context: Context, location: Location): String {
        val geocoder = Geocoder(context, Locale.getDefault())

        val addresses: List<Address> =
            geocoder.getFromLocation(location.latitude, location.longitude, 1)
        val address: String = addresses[0].getAddressLine(0)
        val city: String = addresses[0].getLocality()
        return city
    }

    fun checkLocationPermission(context: Context, callback: () -> Unit) {
        if (ActivityCompat.checkSelfPermission(
                context,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    context as Activity,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
                AlertDialog.Builder(context)
                    .setTitle("Location Permission Needed")
                    .setMessage("This app needs the Location permission, please accept to use location functionality")
                    .setPositiveButton(
                        "OK"
                    ) { _, _ ->
                        //Prompt the user once explanation has been shown
                        requestLocationPermission(context)
                    }
                    .create()
                    .show()
            } else {
                // No explanation needed, we can request the permission.
                requestLocationPermission(context)
            }
        } else {
            callback.invoke()
        }
    }

    private fun requestLocationPermission(context: Context) {
        ActivityCompat.requestPermissions(
            context as Activity,
            arrayOf(
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ),
            1001
        )
    }
}