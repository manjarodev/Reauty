package com.app.blingy.reauty.core.util

import java.lang.IllegalArgumentException

data class DataOrException<out T, out E: Exception?>(val data: T?, val exception: E?) {
    init {
        if (data == null && exception == null) {
            throw IllegalArgumentException("Both data and exception can't be null")
        }
        else if (data != null && exception != null) {
            throw IllegalArgumentException("Both data and exception can't be non-null")
        }
    }
}