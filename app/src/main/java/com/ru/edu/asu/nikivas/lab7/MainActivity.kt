package com.ru.edu.asu.nikivas.lab7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL
import android.os.StrictMode
import com.beust.klaxon.Klaxon
import com.ru.edu.asu.nikivas.lab7.R.id.listView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.reflect.KClass
import kotlinx.serialization.*
import kotlinx.serialization.json.JSON


class MainActivity : AppCompatActivity() {
    @Serializable
    data class Data(val n: String? = "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val  c = this;
        val sw = findViewById<SearchView>(R.id.searchView);
        sw.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {

                doAsync {

                    var resultList: MutableList<StarWarsUnit> = mutableListOf();

                    var res = URL("https://swapi.co/api/people?search=$query").readText();
                    var peopleJsonRes = Klaxon().parse<StarWarsPeopleCollection>(res)!!
                    var listPeoples = peopleJsonRes.results!!;
                    listPeoples.forEach(){
                        resultList.add(it)
                    }


                    res = URL("https://swapi.co/api/planets?search=$query").readText();
                    var planetJsonRes = Klaxon().parse<StarWarsPlanetCollection>(res)!!
                    var planetList = planetJsonRes.results!!;
                    planetList.forEach(){
                        resultList.add(it)
                    }


                    res = URL("https://swapi.co/api/films?search=$query").readText();
                    var filmJsonRes= Klaxon().parse<StarWarsFilmCollection>(res)!!
                    var filmListPeoples= filmJsonRes.results!!;
                    filmListPeoples.forEach(){
                        resultList.add(it)
                    }


                    res = URL("https://swapi.co/api/species?search=$query").readText();
                    var speciesJsonRes= Klaxon().parse<StarWarsFilmCollection>(res)!!
                    var speciesListPeoples= speciesJsonRes.results!!;
                    speciesListPeoples.forEach(){
                        resultList.add(it)
                    }


                    res = URL("https://swapi.co/api/vehicles?search=$query").readText();
                    var vehiclesJsonRes= Klaxon().parse<StarWarsVehiclesCollection>(res)!!
                    var vehiclesListPeoples= vehiclesJsonRes.results!!;
                    vehiclesListPeoples.forEach(){
                        resultList.add(it)
                    }



                    res = URL("https://swapi.co/api/starships?search=$query").readText();
                    var starshipsJsonRes= Klaxon().parse<StarWarsStarshipCollection>(res)!!
                    var starshipsListPeoples= starshipsJsonRes.results!!;
                    starshipsListPeoples.forEach(){
                        resultList.add(it)
                    }

                    uiThread{
                        var adap = PeopleAdapter(c,resultList);
                        listView?.adapter = adap;
                        adap.notifyDataSetChanged();
                    }


                }


                return false
            }
        })


    }
}
