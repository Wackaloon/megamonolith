package com.wackaloon.megamonolith

import android.util.Log
import com.wackaloon.feature_y.FeatureYRepository
import javax.inject.Inject

class FeatureYRepositoryImpl @Inject constructor(): FeatureYRepository {
    override fun fetchData() {
        Log.d("FeatureYRepository", "fetch data was called")
    }

}
