package com.wackaloon.feature_y

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.wackaloon.common_core.ErrorNavigator
import com.wackaloon.feature_y.dagger.FeatureYComponent
import javax.inject.Inject

class FeatureYActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: FeatureYRepository

    @Inject
    lateinit var errorNavigator: ErrorNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_y)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            errorNavigator.navigateToErrorScreen()
        }
    }

    override fun onStart() {
        super.onStart()
        repository.fetchData()
    }

    private fun injectDependencies() {
        FeatureYComponent.get(this).inject(this)
    }
}
