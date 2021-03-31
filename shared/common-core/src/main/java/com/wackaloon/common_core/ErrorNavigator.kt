package com.wackaloon.common_core

import android.app.Activity

interface ErrorNavigator {
    fun navigateToErrorScreen()
}

interface ErrorNavigatorFactory {
    fun create(activity: Activity):ErrorNavigator
}
