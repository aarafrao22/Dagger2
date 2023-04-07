package com.aarafrao.dagger2yt

import android.util.Log
import javax.inject.Inject

class Vegetables @Inject constructor() {
    init {
        Log.d("TAG", "Found Veges")
    }
}