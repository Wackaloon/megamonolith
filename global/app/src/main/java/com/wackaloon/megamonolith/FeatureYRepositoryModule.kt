package com.wackaloon.megamonolith

import com.wackaloon.feature_y.FeatureYRepository
import com.wackaloon.feature_y.dagger.FeatureY
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface FeatureYRepositoryModule {
    @Binds
    fun provideRepository(impl: FeatureYRepositoryImpl): FeatureYRepository
}
