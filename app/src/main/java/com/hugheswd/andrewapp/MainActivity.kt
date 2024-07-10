package com.hugheswd.andrewapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.hugheswd.andrewapp.ui.RootLayout
import com.hugheswd.andrewapp.ui.theme.AndrewAppTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalMaterialApi
@OptIn(ExperimentalAnimationApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildUi()
    }

    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    private fun buildUi() {
        setContent {
            AndrewAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    RootLayout(viewModel)
                }
            }
        }
    }
}
