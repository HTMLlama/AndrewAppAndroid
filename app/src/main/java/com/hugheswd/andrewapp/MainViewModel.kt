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

    private val _foo = MutableStateFlow("Bar")
    val foo: StateFlow<String> = _foo

    fun changeFoo(str: String) {
        viewModelScope.launch {
            _foo.emit(str)
        }
    }
}
