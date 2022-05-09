package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()){
    val a = readLine().split(" ").map { it.toInt() }
    var sum = 0

    for(i in a.indices) {
        sum += a[i]
    }

    print(sum)
}