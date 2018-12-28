package com.ru.edu.asu.nikivas.lab7

import com.beust.klaxon.Json

class StarWarsVehicles(
        @Json(ignored = false)
        val name: String? = "",

        @Json(ignored = false)
        val model: String? = "",

        @Json(ignored = false)
        val manufacturer: String? = "",

        @Json(ignored = false)
        val cost_in_credits: String? = "",

        @Json(ignored = false)
        val length: String? = "",

        @Json(ignored = false)
        val max_atmosphering_speed: String? = "",

        @Json(ignored = false)
        val passengers: String? = ""



) : StarWarsUnit(){
    override fun getTopMidValue() : String?{
        return " vehicle: "+name;
    }

    override fun getBotLeftValue() : String?{
        return " model: "+model;
    }

    override fun getBotMidValue() : String?{
        return " cost: "+cost_in_credits;
    }

    override fun getBotRightValue() : String?{
        return " max speed: "+max_atmosphering_speed;
    }
}