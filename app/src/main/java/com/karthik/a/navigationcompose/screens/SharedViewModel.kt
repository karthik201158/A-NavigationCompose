package com.karthik.a.navigationcompose.screens

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel() {
    private val _sharedData = MutableStateFlow<String>("")
    val sharedData: StateFlow<String> get() = _sharedData

    fun updateData(data: String) {
        _sharedData.value = data
    }
}
