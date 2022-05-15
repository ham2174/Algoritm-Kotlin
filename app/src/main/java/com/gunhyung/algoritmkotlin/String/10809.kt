package com.gunhyung.algoritmkotlin.String

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine()
    val arr = Array(26){-1}

    for(i in a.indices) {
        if(arr[a[i] - 'a'] == -1) {
            arr[a[i] - 'a'] = i
        }
    }

    val sb = StringBuilder()

    arr.forEach { sb.append("$it ") }

    print(sb)
}