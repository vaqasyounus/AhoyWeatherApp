package com.example.ahoy.weatherapp.ui.five_days_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ahoy.weatherapp.R
import com.example.ahoy.weatherapp.databinding.FragmentFiveDaysWeatherBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FiveDaysWeatherFragment : Fragment(R.layout.fragment_five_days_weather) {

    val fiveDaysViewModel:FiveDaysWeatherViewModel by viewModels()

    private var _binding:FragmentFiveDaysWeatherBinding? = null
    private val binding get() = _binding!!

    private lateinit var fiveDaysWeatherAdapter: FiveDaysWeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFiveDaysWeatherBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupFiveDaysWeatherObserver()
    }

    private fun setupFiveDaysWeatherObserver() {
        fiveDaysViewModel.uiState.observe(viewLifecycleOwner, Observer { uiState ->
            uiState.fiveDaysWeather?.let {
                fiveDaysWeatherAdapter.differ.submitList(it.weatherList)
            }
        })
    }

    private fun setupRecyclerView() {
        fiveDaysWeatherAdapter = FiveDaysWeatherAdapter()
        binding.rvFiveDaysWeather.apply {
            adapter = fiveDaysWeatherAdapter
            layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}