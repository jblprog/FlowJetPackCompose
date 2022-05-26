package com.jblprog.flowjetpackcompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {
    val countDownFlow = flow<Int> {
        val startingValue = 10
        emit(startingValue)
        var currentValue = startingValue
        while(currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }
    }
}