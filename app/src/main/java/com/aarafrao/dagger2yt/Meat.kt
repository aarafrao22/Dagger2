package com.aarafrao.dagger2yt

import android.util.Log
import javax.inject.Inject

class Meat @Inject constructor() {

    init {
        Log.d("TAG", "Found Meat")
    }
}