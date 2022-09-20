package com.example.wtmassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager()

    }

    private fun viewPager() {
        tabLayout = findViewById(R.id.tab_layout)

        viewPager = findViewById(R.id.view_pager)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
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