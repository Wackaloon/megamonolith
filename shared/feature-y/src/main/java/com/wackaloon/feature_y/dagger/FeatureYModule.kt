package com.wackaloon.feature_y.dagger

import android.app.Activity
import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.common_core.SecurePreferences
import com.wackaloon.common_core.SharedComponentsRegistry
import dagger.Module
import dagger.Provides

@Module
class FeatureYModule {
    @Provides
    fun provideSecurePrefs(): SecurePreferences {
        return SharedComponentsRegistry.securePreferences
    }

    @Provides
    fun provideErrorNavigator(activity: Activity): ErrorNavigator {
        return SharedComponentsRegistry.errorNavigatorFactory.create(activity)
    }

}
