package com.ru.edu.asu.nikivas.lab7

import com.beust.klaxon.Json

class StarWarsVehiclesCollection(
        @Json(ignored = false)
        val count: Int? = 0,

        @Json(ignored = false)
        val next: String? = "",

        @Json(ignored = false)
        val previous: String? = "",

        @Json(ignored = false)
        val results: List<StarWarsVehicles>? = null
)