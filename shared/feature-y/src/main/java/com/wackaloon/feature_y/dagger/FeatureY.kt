package com.wackaloon.feature_y.dagger

import android.app.Activity
import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.feature_y.FeatureYRepository

interface FeatureY {

    companion object {
        fun registerDependencies(factory: DependenciesFactory) {
            FeatureYComponent.dependenciesFactory = factory
        }
    }

    interface Dependencies {
        val repository: FeatureYRepository
        val errorNavigator: ErrorNavigator
    }

    fun interface DependenciesFactory {
        fun create(activity: Activity): Dependencies
    }
}
