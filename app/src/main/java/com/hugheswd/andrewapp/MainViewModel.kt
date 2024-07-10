package com.hugheswd.andrewapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    // Example of StateFlow
    private val _foo = MutableStateFlow("Bar")
    val foo: StateFlow<String> = _foo

    fun changeFoo(str: String) {
        viewModelScope.launch {
            _foo.emit(str)
        }
    }
    // End Example

    // ---------------------------------

    private val _isUserNameFromAndreas = MutableStateFlow<Boolean?>(null)
    val isUserNameFromAndreas: StateFlow<Boolean?> = _isUserNameFromAndreas

    private val namesFromAndreas = listOf(
        "andreas",
        "andrew",
        "andrea",
        "anders",
        "andré",
        "andre",
        "ander",
        "andy",
        "andrean",
        "andrei",
        "andrejs",
        "andrzej",
        "andriy",
        "andrea",
        "andrey",
        "andrej",
        "andrés",
        "andres",
        "drew",
        "andres",
        "antti",
        "anne",
    )

    fun isNameFromAndreas(name: String) {
        viewModelScope.launch {
            _isUserNameFromAndreas.emit(namesFromAndreas.contains(name.lowercase()))
        }
    }
}
