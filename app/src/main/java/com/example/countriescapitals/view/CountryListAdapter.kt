package com.example.countriescapitals.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.countriescapitals.R
import com.example.countriescapitals.model.Country
import com.example.countriescapitals.util.getProgressDrawable
import com.example.countriescapitals.util.loadImage


import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter(var countries:ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    //giving mainActivity a way to update the countries whenever it needs to
    fun updateCountries(newCountries: List<Country>){
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val imageView = view.imageView
        private val countryName = view.name
        private val countryCapital = view.capital
        private val countrypopulation = view.population

        //for imageview
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(country: Country){
            countryName.text = country.countryName
            countryCapital.text = country.capital
            countrypopulation.text = country.population

            //for imageview
            imageView.loadImage(country.flag, progressDrawable)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int)= CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )



    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount() = countries.size

}