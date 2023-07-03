package com.gunhyung.algoritmkotlin.baekjoon.조건문

fun main() {
    val year = readLine()!!.toInt()

    when {
        year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) -> print("1")
        else -> print("0")
    }
}