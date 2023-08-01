package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toList().sortedDescending()

            for (i in N) {
                write(i.toString())
            }

            close()
        }
        close()
    }
}