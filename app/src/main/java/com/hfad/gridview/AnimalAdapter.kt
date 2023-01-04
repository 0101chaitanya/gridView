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
        val layoutInflater: LayoutInflater = context.getSystemService(Context
            .LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var convertViewLocal = convertView

      if(convertViewLocal == null){
          convertViewLocal = layoutInflater.inflate(R.layout.custom_layout,
              parent,false)
      }

        val animalName:TextView = convertViewLocal!!.findViewById(R.id.textView)
        val animalImage: ImageView = convertViewLocal.findViewById(R.id.imageView)
        animalName.text = nameList[position]
        animalImage.setImageResource(imageList[position])
        return convertViewLocal
    }
}