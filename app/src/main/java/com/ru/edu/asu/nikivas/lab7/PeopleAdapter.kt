package com.ru.edu.asu.nikivas.lab7

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PeopleAdapter(val context: Context, val peoples: List<StarWarsUnit>) : BaseAdapter() {
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getItem(p0: Int): Any {
        return peoples.get(p0);
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    override fun getCount(): Int {
        return peoples.size;
    }

    @SuppressLint("ViewHolder")
    override fun getView(index: Int, currentView: View?, parentView: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item_recipe, parentView,false);
        val nameText = rowView!!.findViewById<TextView>(R.id.name);
        nameText.text = peoples[index].getTopMidValue();

        val heightText = rowView.findViewById<TextView>(R.id.peopleHeight)
        heightText.text = peoples[index].getBotLeftValue();

        val massText = rowView.findViewById<TextView>(R.id.peopleMass)
        massText.text = peoples[index].getBotMidValue();

        val gender = rowView.findViewById<TextView>(R.id.gender)
        gender.text = peoples[index].getBotRightValue();

        return rowView;
    }

}