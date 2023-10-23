@file:Suppress("UNREACHABLE_CODE")

package com.example.cursoedteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.cursoedteam.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


    }


}