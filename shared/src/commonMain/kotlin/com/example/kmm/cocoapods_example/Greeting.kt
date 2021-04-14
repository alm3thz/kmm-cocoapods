package com.example.kmm.cocoapods_example

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}