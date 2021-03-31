package com.wackaloon.feature_y.dagger

import android.app.Activity
import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.common_core.SecurePreferences
import com.wackaloon.common_core.SharedComponentsRegistry
import com.wackaloon.feature_y.FeatureYActivity
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [FeatureY.Dependencies::class])
interface FeatureYComponent {
    
    fun inject(featureYActivity: FeatureYActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance activity: Activity,
            dependencies: FeatureY.Dependencies
        ): FeatureYComponent
    }

    companion object {
        var dependenciesFactory: FeatureY.DependenciesFactory? = null

        fun get(activity: Activity): FeatureYComponent {
            return DaggerFeatureYComponent.factory()
                .create(activity, dependenciesFactory!!.create(activity))
        }
    }

}
