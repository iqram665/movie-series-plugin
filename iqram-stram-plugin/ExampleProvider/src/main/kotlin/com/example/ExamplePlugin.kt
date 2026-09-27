package com.example

import com.lagradost.cloudstream3.plugins.Plugin

class ExamplePlugin : Plugin() {
    override fun load() {
        registerMainAPI(ExampleProvider())
    }
}