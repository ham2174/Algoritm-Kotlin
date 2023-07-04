package com.gunhyung.algoritmkotlin.baekjoon.반복문

fun main() {
    val X = readLine()!!.toInt()
    val N = readLine()!!.toInt() - 1
    var temp = 0

    for (i in 0..N) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        temp += a * b
    }

    if (temp == X) {
        print("Yes")
    } else {
        print("No")
    }
}