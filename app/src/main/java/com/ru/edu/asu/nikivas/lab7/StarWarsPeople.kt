package com.ru.edu.asu.nikivas.lab7

import com.beust.klaxon.Json
import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class StarWarsPeople(
        @Json(ignored = false)
        @Optional
        val name: String? = "",

        @Json(ignored = false)
        val height: String? = "",

        @Json(ignored = false)
        val mass: String? = "",

        @Json(ignored = false)
        val hair_color: String? = "",

        @Json(ignored = false)
        val skin_color: String? = "",

        @Json(ignored = false)
        val eye_color: String? = "",

        @Json(ignored = false)
        val birth_year: String? = "",

        @Json(ignored = false)
        val gender: String? = "",

        @Json(ignored = false)
        val homeworld: String? = ""
) : StarWarsUnit()
{
    override fun getTopMidValue() : String?{
        return " name: "+name;
    }

    override fun getBotLeftValue() : String?{
        return " height: "+height;
    }

    override fun getBotMidValue() : String?{
        return " mass: "+mass;
    }

    override fun getBotRightValue() : String?{
        return " gender: "+gender;
    }
}