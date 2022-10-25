package com.example.ahoy.weatherapp.data

import android.app.Activity
import android.content.Context
import android.content.IntentSender
import android.os.Looper
import com.example.ahoy.weatherapp.core.WeatherUtils
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.google.android.gms.tasks.Task


class MyLocation constructor(var context: Context) {

    companion object {
        var REQUEST_CHECK_SETTINGS = 123456789
    }

    private var fusedLocationClient: FusedLocationProviderClient =
        LocationServices.getFusedLocationProviderClient(context)
    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest

    init {
        setLocationRequest()
        setLocationSettingRequest()
//        setLocationCallback()
    }

    fun setLocationRequest() {

        locationRequest = LocationRequest.create().apply {
            interval = 60 * 1000
            fastestInterval = 60 * 1000
            priority = LocationRequest.PRIORITY_LOW_POWER
        }

    }

    fun setLocationCallback(callback: (String) -> Unit) {
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                locationResult ?: return
                callback(WeatherUtils.locationToCity(context, locationResult.lastLocation!!))
            }
        }
    }

    private fun registerLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            Looper.getMainLooper()
        )
    }

    fun removeLocationUpdates() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    fun setLocationSettingRequest() {

        val builder = LocationSettingsRequest.Builder()
        val client: SettingsClient = LocationServices.getSettingsClient(context)
        val task: Task<LocationSettingsResponse> = client.checkLocationSettings(builder.build())
        task.addOnSuccessListener { locationSettingsResponse ->
            // All location settings are satisfied. The client can initialize
            // location requests here.
            registerLocationUpdates()
        }

        task.addOnFailureListener { exception ->
            if (exception is ResolvableApiException) {
                // Location settings are not satisfied, but this can be fixed
                // by showing the user a dialog.
                try {
                    // Show the dialog by calling startResolutionForResult(),
                    // and check the result in onActivityResult().
                    exception.startResolutionForResult(
                        context as Activity,
                        REQUEST_CHECK_SETTINGS
                    )
                } catch (sendEx: IntentSender.SendIntentException) {
                    // Ignore the error.
                }
            }
        }
    }


}