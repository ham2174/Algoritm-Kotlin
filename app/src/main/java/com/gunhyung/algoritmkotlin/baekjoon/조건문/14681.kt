package com.gunhyung.algoritmkotlin.baekjoon.조건문

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    when {
        x > 0  && y > 0 -> print("1")
        x < 0  && y > 0 -> print("2")
        x < 0  && y < 0 -> print("3")
        x > 0  && y < 0 -> print("4")
    }
}