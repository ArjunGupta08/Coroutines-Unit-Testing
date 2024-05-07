package com.arjungupta08.coroutines_unittesting

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Util(val dispatcher: CoroutineDispatcher) {

    suspend fun getUserName() : String {
        delay(1000)
        return "CheezyCode"
    }

    suspend fun getUser() : String {
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
        }
        return "User - CheezyCode"
    }

    var globalArg = false
    fun getAddress() {
        CoroutineScope(dispatcher).launch {
            globalArg = true
        }
    }
}