package com.hfad.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
return nameList.size
    }

    override fun getItem(position: Int): Any? {
return null
    }

    override fun getItemId(position: Int): Long {
return 0
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
val view:View = LayoutInflater.from(parent?.context).inflate(/* resource = */ R.layout
    .custom_layout,/* root = */ parent,/* attachToRoot = */ false)

        var animalName:TextView = view.findViewById(R.id.textView)
        var animalImage: ImageView = view.findViewById(R.id.imageView)
        animalName.text = nameList[position]
        animalImage.setImageResource(imageList[position])
        return view
    }
}