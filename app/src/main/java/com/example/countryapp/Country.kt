package com.example.countryapp

data class Country(
    val names: List<Names>,
    val population: Long,
    val capital: String,
    val area: Long,
    val languages: List<Languages>
)

data class Names (val names: String)

data class  Languages (val language: String)


