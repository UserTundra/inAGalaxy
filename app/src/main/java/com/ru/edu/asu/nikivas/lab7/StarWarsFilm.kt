package com.ru.edu.asu.nikivas.lab7
import com.beust.klaxon.Json

class StarWarsFilm (

        @Json(ignored = false)
        val title : String? = "",

        @Json(ignored = false)
        val opening_crawl : String? = "",

        @Json(ignored = false)
        val director: String? = "",

        @Json(ignored = false)
        val producer : String? = "",

        @Json(ignored = false)
        val release_date : String? = ""

): StarWarsUnit()
{
    override fun getTopMidValue() : String?{
        return " film: "+title;
    }

    override fun getBotLeftValue() : String?{
        return " producer: "+producer;
    }
    override fun getBotMidValue() : String?{
        return " opening: "+opening_crawl;
    }
    override fun getBotRightValue() : String?{
        return " release date: "+release_date;
    }
}