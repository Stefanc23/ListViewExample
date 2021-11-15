package com.example.listviewexample.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listviewexample.R
import com.example.listviewexample.model.Coffee

class CoffeeAdapter(private val context: Context,
                    private val dataSource: ArrayList<Coffee>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount() = dataSource.size

    override fun getItem(p0: Int) = dataSource[p0]

    override fun getItemId(p0: Int) = p0.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item, p2, false)
        val imageView = rowView.findViewById<ImageView>(R.id.coffee_image)
        val nameTextView = rowView.findViewById<TextView>(R.id.coffee_name)
        val descriptionTextView = rowView.findViewById<TextView>(R.id.coffee_description)

        val coffee: Coffee = getItem(p0)
        imageView.setImageResource(coffee.imageResourceId)
        nameTextView.text = coffee.name
        descriptionTextView.text = coffee.description

        return rowView
    }
}