package com.wackaloon.megamonolith

import dagger.Component

@Component(modules = [
    FeatureYDependenciesModule::class,
])
interface GlobalApplicationComponent  {
    fun inject(globalApplication: GlobalApplication)

    @Component.Factory
    interface Factory {
        fun create(): GlobalApplicationComponent
    }
    companion object {

        fun get(): GlobalApplicationComponent {
            return DaggerGlobalApplicationComponent.factory()
                .create()
        }
    }
}
