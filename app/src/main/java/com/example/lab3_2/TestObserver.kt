package com.example.lab3_2

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class TestObserver : LifecycleObserver {

    @OnLifecycleEvent (Lifecycle.Event.ON_ANY)
    fun printLog(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("TEST", event.toString())
    }
}