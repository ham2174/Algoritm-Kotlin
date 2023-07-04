package com.gunhyung.algoritmkotlin.baekjoon.반복문

fun main() {
    val N = readln().toInt()
    var temp = ""

    for (i in 0 until N/4) {
        temp += "long "
    }

    print(temp+"int")
}