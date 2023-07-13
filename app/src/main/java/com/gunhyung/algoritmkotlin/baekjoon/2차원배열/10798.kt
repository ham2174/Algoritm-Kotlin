package com.gunhyung.algoritmkotlin.baekjoon.`2차원배열`

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val list = Array(5) { readLine().toList() }
            var maxIndex = 0

            repeat(list.size) {
                if (maxIndex < list[it].size) {
                    maxIndex = list[it].size
                }
            }

            for (i in 0 until maxIndex) {
                for (j in 0 until 5) {
                    if (list[j].size > i) {
                        write(list[j][i].toString())
                    }
                }
            }

            close()
        }
        close()
    }
}