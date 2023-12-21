package com.dicoding.spongebob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBbottomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bbottom)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bbottom = intent.getParcelableExtra<Bbottom>(MainActivity.INTENT_PARCELABLE)

        val imgBbottom = findViewById<ImageView>(R.id.img_item_photo)
        val nameBbottom = findViewById<TextView>(R.id.tv_item_name)
        val descBbottom = findViewById<TextView>(R.id.tv_item_description)

        imgBbottom.setImageResource(bbottom?.imgBbottom!!)
        nameBbottom.text = bbottom.nameBbottom
        descBbottom.text = bbottom.descBbottom

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}