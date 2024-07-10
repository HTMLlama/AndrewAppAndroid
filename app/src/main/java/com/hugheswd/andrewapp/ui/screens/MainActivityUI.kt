package com.hugheswd.andrewapp.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hugheswd.andrewapp.ui.theme.AndrewAppTheme

// Main UI ------------------------------------
@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
fun MainActivityUI(foo: String) {
    BuildUI(foo)
}

@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
private fun BuildUI(str: String) {
    Column {
        Text(str)
    }
}

@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndrewAppTheme {
        BuildUI("Test")
    }
}
