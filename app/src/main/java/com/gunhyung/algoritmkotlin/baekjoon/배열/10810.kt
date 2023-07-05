package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val result = arrayListOf<Int>().apply { repeat(N) { add(0) } }

            for (a in 0 until M) {
                val (i, j, k) = readLine().split(" ").map(String::toInt)
                for (b in i-1 until j) {
                    result[b] = k
                }
            }

            result.run {
                print(joinToString(" "))
            }

            close()
        }
        close()
    }
}