package com.qonita.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.qonita.foodapp.Fragment.BrakefastFragment
import com.qonita.foodapp.Fragment.VegetarianFragment
import com.qonita.foodapp.Fragment.dessertFragment
import com.qonita.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setCurrentfragment(BrakefastFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.icBreakfast ->setCurrentfragment(BrakefastFragment())
                R.id.icVegetarian ->setCurrentfragment(VegetarianFragment())
                R.id.iccake ->setCurrentfragment(dessertFragment())
            }
            true

        }
    }

    private fun setCurrentfragment(fragment : Fragment) {
        supportFragmentManager. beginTransaction(). apply {
            replace(R.id.flMain, fragment)
            commit()
        }

    }
}