package com.example.ahoy.weatherapp.core

import android.widget.ImageView

interface IImageProcess {

    fun loadUrl(url:String,imageView:ImageView)
}