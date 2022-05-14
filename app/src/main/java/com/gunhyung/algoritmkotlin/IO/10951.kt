package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()) {
    var sum: Int
    val sb = StringBuilder()

    while (true) {
        val a = readLine()?.split(" ")?.map { it.toInt() }?:break

        sum = 0

        for(i in a.indices) {
            sum += a[i]
        }

        sb.append(sum).append("\n")
    }

    print(sb)
}