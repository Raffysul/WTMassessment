package com.example.wtmassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        view_pager.adapter = adapter
        TabLayoutMediator(tab_layout, view_pager){tab, position->
            when (position) {
                0 -> {
                    tab.text = "Sign In"
                }
                1 -> {
                    tab.text = "Sign Up"
                }
            }
        }.attach()

    }
}