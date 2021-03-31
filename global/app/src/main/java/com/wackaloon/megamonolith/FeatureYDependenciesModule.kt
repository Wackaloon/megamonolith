package com.wackaloon.megamonolith

import com.wackaloon.feature_y.dagger.FeatureY
import dagger.Module
import dagger.Provides

@Module
object FeatureYDependenciesModule {
    @Provides
    fun provideFactory(): FeatureY.DependenciesFactory {
        return DaggerFeatureYDependeciesComponent.factory()
    }
}
