package com.gunhyung.algoritmkotlin.baekjoon

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    print(a % b)
}