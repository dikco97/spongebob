package com.dicoding.spongebob

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BbottomAdapter (private val context: Context, private val bbotom : List<Bbottom>, val listener: (Bbottom) -> Unit)
    : RecyclerView.Adapter<BbottomAdapter.BbottomViewHolder>() {
    class BbottomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgBbottom = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBbottom = view.findViewById<TextView>(R.id.tv_item_name)
        val descBbottom = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(bbottom: Bbottom, listener: (Bbottom) -> Unit) {
            imgBbottom.setImageResource(bbottom.imgBbottom)
            nameBbottom.text = bbottom.nameBbottom
            descBbottom.text = bbottom.descBbottom
            itemView.setOnClickListener{
                listener(bbottom)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BbottomViewHolder {
        return BbottomViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_bbottom, parent, false)
        )
    }


    override fun onBindViewHolder(holder: BbottomViewHolder, position: Int) {
      holder.bindview(bbotom[position], listener)
    }
    override fun getItemCount(): Int = bbotom.size
    }
