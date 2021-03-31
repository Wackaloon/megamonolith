package com.wackaloon.megamonolith.somepackage

import android.app.Activity
import android.widget.Toast
import com.wackaloon.common_core.ErrorNavigator
import javax.inject.Inject

class ErrorNavigatorImpl @Inject constructor(private val activity: Activity) : ErrorNavigator {
    override fun navigateToErrorScreen() {
        Toast.makeText(activity, "Error navigation", Toast.LENGTH_LONG).show()
    }
}
