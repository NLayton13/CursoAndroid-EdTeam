package com.example.cursoedteam

import android.graphics.drawable.Drawable

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestListener

fun ImageView.loadFromUrl(url: String, listeners: RequestListener<Drawable>){
    Glide
        .with(this)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .addListener(listeners)
        .into(this)
}
fun ImageView.loadFromUrl(url: String){
    Glide
        .with(this)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .skipMemoryCache(true)
        .into(this)
}