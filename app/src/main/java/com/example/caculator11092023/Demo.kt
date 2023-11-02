
package com.example.calculator11092023

import kotlin.math.sqrt

fun main() {
//        if (value % 2 == 0) {
//            println(value)
//        }

//        Dieu kien in ra so le
//        if (value % 2 != 0) {
//            println(value)
//        }
//    Dieu kien in so chia 3 du 1
//        if (value % 3 == 1) {
//            println(value)
//        }

//    if (sqrt(index.toFloat()) % 1.0f == 0.0f) {
//
//    }
    printForCondition(fun(index): Boolean{
        return sqrt(index.toFloat()) % 1.0f == 0.0f
    })
}

fun printForCondition(checkCondition: (index: Int) -> Boolean) {
    for (index in 0..100) {
        val isTrue = checkCondition(index)
        if (isTrue) {
            println(index)
        }
    }
}