package com.ru.edu.asu.nikivas.lab7

import com.beust.klaxon.Json

data class StarWarsPlanet(
        @Json(ignored = false)
        val name: String? = "",

        @Json(ignored = false)
        val rotation_period: String? = "",

        @Json(ignored = false)
        val orbital_period: String? = "",

        @Json(ignored = false)
        val diameter: String? = "",

        @Json(ignored = false)
        val climate: String? = "",

        @Json(ignored = false)
        val gravity: String? = ""

) : StarWarsUnit()
{
    override fun getTopMidValue() : String?{
        return " planet: "+name;
    }

    override fun getBotLeftValue() : String?{
        return " diameter: "+diameter;
    }
    override fun getBotMidValue() : String?{
        return " climate: "+climate;
    }
    override fun getBotRightValue() : String?{
        return " orbit: "+orbital_period;
    }
}