package com.wackaloon.megamonolith

import android.app.Application
import javax.inject.Inject

class GlobalApplication : Application() {

    @Inject
    lateinit var initializer: SharedComponentsInitializer

    override fun onCreate() {
        injectDependencies()
        super.onCreate()
        registerSharedFeaturesFactories()
    }

    private fun injectDependencies() {
        GlobalApplicationComponent.get().inject(this)
    }

    private fun registerSharedFeaturesFactories() {
        initializer.registerCommonCoreComponents()
    }
}
