package com.wackaloon.megamonolith

import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.feature_y.FeatureYRepository
import com.wackaloon.feature_y.dagger.FeatureY
import com.wackaloon.megamonolith.somepackage.ErrorNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import java.util.logging.ErrorManager

@Module
interface ErrorNavigatorModule {
    @Binds
    fun provideErrorNavigator(impl: ErrorNavigatorImpl): ErrorNavigator
}
