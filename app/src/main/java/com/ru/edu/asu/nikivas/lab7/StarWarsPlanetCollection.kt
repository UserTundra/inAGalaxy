package com.ru.edu.asu.nikivas.lab7
import com.beust.klaxon.Json

data class StarWarsPlanetCollection(
        @Json(ignored = false)
        val count: Int? = 0,

        @Json(ignored = false)
        val next: String? = "",

        @Json(ignored = false)
        val previous: String? = "",

        @Json(ignored = false)
        val results: List<StarWarsPlanet>? = null
)