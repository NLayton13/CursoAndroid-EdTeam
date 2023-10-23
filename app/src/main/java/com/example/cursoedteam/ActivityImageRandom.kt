package com.example.cursoedteam

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.cursoedteam.databinding.ActivityImageRandomBinding
import com.example.cursoedteam.databinding.ActivityMainBinding

class ActivityImageRandom : AppCompatActivity() {
    private lateinit var  viewBinding: ActivityImageRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityImageRandomBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.button?.setOnClickListener{
            viewBinding.loading?.visibility = View.VISIBLE
            val listener = object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>,
                    isFirstResource: Boolean
                ): Boolean {

                    viewBinding.loading?.visibility = View.GONE
                    Toast.makeText(this@ActivityImageRandom,"Error!", Toast.LENGTH_SHORT ).show()
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable,
                    model: Any,
                    target: Target<Drawable>?,
                    dataSource: DataSource,
                    isFirstResource: Boolean
                ): Boolean {
                    viewBinding.loading?.visibility = View.GONE
                    return false
                }


            }
            viewBinding.imageView?.loadFromUrl("https://picsum.photos/600", listener)
        }

        viewBinding.next?.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
    }
}