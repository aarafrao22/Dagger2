package com.aarafrao.dagger2yt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val m = Meat()
//        val b = Bread()
//        val v = Vegetables()
//        val burger = Burger(m,b,v)
//
//        burger.isBurgerReady()


        DaggerBurgerComponent.create().giveMeBurger().isBurgerReady()

    }
}


