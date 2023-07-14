package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun Int.square(): Int = this * this

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            var result = 1

            for (i in 1..N) {
                result *= 2
            }

            write("${(result + 1).square()}")

            close()
        }
        close()
    }
}