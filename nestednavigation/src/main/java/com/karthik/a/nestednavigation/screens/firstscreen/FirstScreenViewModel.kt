package com.karthik.a.nestednavigation.screens.firstscreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class FirstScreenViewModel : ViewModel(){
    private val _firstScreenData = MutableStateFlow<String>("")
    val firstScreenData: StateFlow<String> get() = _firstScreenData

    fun updateData(data: String) {
        _firstScreenData.value = data
    }
}