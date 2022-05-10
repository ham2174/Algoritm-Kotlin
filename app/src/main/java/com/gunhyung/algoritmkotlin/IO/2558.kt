package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()

    val sum: Int = a+b

    print(sum)
}