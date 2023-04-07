package com.aarafrao.dagger2yt

import android.util.Log
import javax.inject.Inject

class Burger @Inject constructor(meat: Meat, bread: Bread, vegetables: Vegetables) {
    init {
        Log.d("TAG", "Found All Ingredients!")
    }


    fun isBurgerReady() {
        Log.d("TAG", "Hurrah! Burger is Ready")

    }
}