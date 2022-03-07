package com.example.countryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countryapp.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)



        binding.searchButton.setOnClickListener {
            val contryName: String = binding.searchCountryTextview.text.toString()
            val contryes: List<Country> = RestCountriesAPI.getCountryByNames(contryName).execute().body()!!
            val contry = contryes[0]

            binding.countryNameTextview.text = contry.names.toString()
            binding.capitalTextview.text = contry.capital
            binding.populationTextview.text = contry.population.toString()
            binding.areaTextview.text = contry.area.toString()
            binding.langsTextview.text = contry.languages.toString()


        }


    }

}



