package com.ru.edu.asu.nikivas.lab7

import com.beust.klaxon.Json

class StarWarsSpecies(
    @Json(ignored = false)
    val name: String? = "",

    @Json(ignored = false)
    val classification: String? = "",

    @Json(ignored = false)
    val designation: String? = "",

    @Json(ignored = false)
    val average_height: String? = "",

    @Json(ignored = false)
    val skin_colors: String? = "",

    @Json(ignored = false)
    val hair_colors: String? = ""




) : StarWarsUnit(){
    override fun getTopMidValue() : String?{
        return " species: "+name;
    }

    override fun getBotLeftValue() : String?{
        return " classification: "+classification;
    }
    override fun getBotMidValue() : String?{
        return " hair: "+hair_colors;
    }
    override fun getBotRightValue() : String?{
        return " designation: "+designation;
    }

}