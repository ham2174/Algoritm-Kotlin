package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val list = IntArray(10001)

            for (i in 0 until N) {
                list[readLine().toInt()]++
            }

            for (i in 1..10000) {
                write("$i\n".repeat(list[i]))
            }

            close()
        }
        close()
    }
}
