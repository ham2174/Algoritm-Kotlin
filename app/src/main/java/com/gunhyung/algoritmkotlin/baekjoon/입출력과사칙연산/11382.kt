package com.gunhyung.algoritmkotlin.baekjoon

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }

    print(a + b + c)
}