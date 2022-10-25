package com.example.ahoy.weatherapp.domain.weather.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.ahoy.weatherapp.core.ImageHelper

data class FiveDaysItem(
    val dtTxt: String,
    val temperature: String,
    val iconUrl: String
){
    companion object{
        @BindingAdapter("loadImage")
        @JvmStatic
        fun loadImage(imageView: ImageView,imageUrl:String){
            ImageHelper().loadUrl(imageUrl,imageView)
        }
    }
}