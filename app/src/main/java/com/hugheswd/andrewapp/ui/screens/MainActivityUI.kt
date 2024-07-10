package com.hugheswd.andrewapp.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.hugheswd.andrewapp.R
import com.hugheswd.andrewapp.ui.theme.AndrewAppTheme

// Main UI ------------------------------------
@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
fun MainActivityUI(
    foo: String,
    isNameFromAndreas: Boolean?,
    checkIsNameFromAndreas: (String) -> Unit,
) {
    var userInputText by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        if (isNameFromAndreas == null || isNameFromAndreas == false) {
            Text(
                stringResource(id = R.string.intro_question),
                color = MaterialTheme.colorScheme.onSecondary,
            )
            if (isNameFromAndreas == false) {
                Text(
                    stringResource(id = R.string.intro_answer_negative),
                    modifier = Modifier.fillMaxWidth(.9f),
                    color = MaterialTheme.colorScheme.onSecondary,
                )
            }
            TextField(
                modifier = Modifier.fillMaxWidth(.9f),
                value = userInputText,
                onValueChange = {
                    userInputText = it
                },
                keyboardActions = KeyboardActions(
                    onDone = { checkIsNameFromAndreas(userInputText) },
                    onGo = { checkIsNameFromAndreas(userInputText) },
                    onNext = { checkIsNameFromAndreas(userInputText) },
                    onSend = { checkIsNameFromAndreas(userInputText) },
                )
            )
            Button(
                onClick = {
                    checkIsNameFromAndreas(userInputText)
                }
            ) {
                Text(text = stringResource(id = R.string.submit))
            }
        } else if (isNameFromAndreas) {
            Text(
                stringResource(id = R.string.intro_answer_positive),
                modifier = Modifier.fillMaxWidth(.9f),
                color = MaterialTheme.colorScheme.onPrimary,
            )
        }
    }
}

@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Composable
private fun BuildUI(str: String) {

}

@ExperimentalMaterialApi
@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndrewAppTheme {
        MainActivityUI("Test", false) { _ -> }
    }
}
