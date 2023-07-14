package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    var N = readln().toInt()
    var i = 1

    while (N > 0) {
        N -= i++
    }

    if (i % 2 == 1) {
        println("${i + N - 1}/${1 - N}")
    } else {
        println("${1 - N}/${i + N - 1}")
    }
}
