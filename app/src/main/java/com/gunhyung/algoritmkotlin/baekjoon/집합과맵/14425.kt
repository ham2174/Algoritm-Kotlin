package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val wordSet = hashSetOf<String>()
            var result = 0

            for (i in 0 until N) {
                wordSet.add(readLine())
            }

            for (i in 0 until M) {
                if (wordSet.contains(readLine())) {
                    result++
                }
            }

            write(result.toString())

            close()
        }
        close()
    }
}