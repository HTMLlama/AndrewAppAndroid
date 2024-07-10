package com.hugheswd.andrewapp.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hugheswd.andrewapp.MainViewModel
import com.hugheswd.andrewapp.model.BaseNavRoute
import com.hugheswd.andrewapp.ui.screens.MainActivityUI

@OptIn(
    ExperimentalMaterialApi::class,
    ExperimentalAnimationApi::class,
)
@Composable
fun RootLayout(viewModel: MainViewModel) {
    val navController = rememberNavController()
    val foo by viewModel.foo.collectAsState()
    
    NavHost(
        navController = navController, 
        startDestination = BaseNavRoute.HOME.id
    ) {
        composable(BaseNavRoute.HOME.id) {
            MainActivityUI(foo)
        }

        composable(BaseNavRoute.NOT_HOME.id) {

        }
    }
}