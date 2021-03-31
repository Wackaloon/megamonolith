package com.wackaloon.megamonolith

import android.app.Activity
import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.feature_y.FeatureYRepository
import com.wackaloon.feature_y.dagger.FeatureY
import com.wackaloon.megamonolith.somepackage.ErrorNavigatorImpl
import dagger.BindsInstance
import dagger.Component

@Component(modules = [
    ErrorNavigatorModule::class,
    FeatureYRepositoryModule::class,
])
interface FeatureYDependeciesComponent : FeatureY.Dependencies {
    @Component.Factory
    interface Factory : FeatureY.DependenciesFactory {
        override fun create(
            @BindsInstance activity: Activity
        ): FeatureY.Dependencies
    }
}
