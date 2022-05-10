package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sb = StringBuilder()

    for(i in 0 until n) {
        val a = readLine().split(" ").map { it.toInt() }
        var sum = 0

        for(j in a.indices) {
            sum += a[j]
        }
        sb.append(sum).append("\n")
    }
    print(sb)
}