package com.example.life.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.life.R
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class ExploreActivity : AppCompatActivity() {
    var imageArray:ArrayList<Int> = ArrayList()
    var carouselView:CarouselView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        imageArray.add(R.drawable.ripped)
        imageArray.add(R.drawable.recipess)
        imageArray.add(R.drawable.yoga)
        imageArray.add(R.drawable.hairroutine)
        imageArray.add(R.drawable.quotes)
        imageArray.add(R.drawable.mindfulness)


        carouselView = findViewById(R.id.carouselView)

        carouselView!!.pageCount = imageArray.size
        carouselView!!.setImageListener(imageListener)


    }
    var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position]) }
}