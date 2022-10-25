package com.example.ahoy.weatherapp.ui.current_weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.ahoy.weatherapp.R
import com.example.ahoy.weatherapp.databinding.FragmentCurrentWeatherBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrentWeatherFragment : Fragment(R.layout.fragment_current_weather) {

    private val currentWeatherViewModel: CurrentWeatherViewModel by viewModels()

    private var _binding: FragmentCurrentWeatherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCurrentWeatherBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupCurrentWeatherObserver()
        setClickListener(view)
    }

    private fun setupCurrentWeatherObserver() {
        currentWeatherViewModel.uiState.observe(viewLifecycleOwner, Observer { uiState ->
            binding.uiState = uiState
        })

    }

    private fun setClickListener(view: View) {
        binding.cvFiveForcast.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_currentWeatherFragment_to_futureWeatherFragment);
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}