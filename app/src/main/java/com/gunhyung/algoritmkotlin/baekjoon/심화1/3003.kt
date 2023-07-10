package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val chessList = listOf(1, 1, 2, 2, 2, 8)
            val findChess = readLine().split(" ").map(String::toInt)

            for (i in chessList.indices) {
                write("${(chessList[i] - findChess[i])} ")
            }

            close()
        }
        close()
    }
}