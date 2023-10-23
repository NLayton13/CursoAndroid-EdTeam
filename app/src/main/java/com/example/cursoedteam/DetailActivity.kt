package com.example.cursoedteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cursoedteam.databinding.ActivityDetailBinding
import com.example.cursoedteam.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var  viewBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.previn?.setOnClickListener{

            var redireccion = Intent(this,ActivityImageRandom::class.java)
            startActivity(redireccion)
        }
    }
}