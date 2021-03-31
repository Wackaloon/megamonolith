package com.wackaloon.megamonolith

import javax.inject.Inject

class SharedComponentsInitializer @Inject constructor(
    private val featureYInitializer: FeatureYInitializer
) {
    fun registerCommonCoreComponents() {
        featureYInitializer.registerSharedComponents()
    }
}
