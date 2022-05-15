package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine()
    val arr = Array(26){ 0 }

    for(i in a.indices) {
        arr[a[i] - 'a']++
    }

    val sb = StringBuilder()

    arr.forEach { sb.append("$it ") }

    print(sb)
}