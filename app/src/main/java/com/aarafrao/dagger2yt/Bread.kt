package com.aarafrao.dagger2yt

import android.util.Log
import javax.inject.Inject

class Bread @Inject constructor() {
    init {
        Log.d("TAG", "Found Bread")
    }
}