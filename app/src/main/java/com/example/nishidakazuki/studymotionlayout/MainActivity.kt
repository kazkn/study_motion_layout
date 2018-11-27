package com.example.nishidakazuki.studymotionlayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun switch01(view: View) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_frame, Example01Fragment())
                .addToBackStack(null)
                .commit()
    }

    fun switch02(view: View) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_frame, Example02Fragment())
                .addToBackStack(null)
                .commit()
    }

    fun switch03(view: View) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_frame, Example03Fragment())
                .addToBackStack(null)
                .commit()
    }

}
