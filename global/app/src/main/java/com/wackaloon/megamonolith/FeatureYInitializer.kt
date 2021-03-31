package com.wackaloon.megamonolith

import com.wackaloon.feature_y.dagger.FeatureY
import javax.inject.Inject

class FeatureYInitializer @Inject constructor(
    private val dependenciesFactory: FeatureY.DependenciesFactory
) {
    fun registerSharedComponents() {
        FeatureY.registerDependencies(dependenciesFactory)
    }
}
