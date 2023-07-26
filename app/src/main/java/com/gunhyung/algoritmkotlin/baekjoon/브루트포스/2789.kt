package com.gunhyung.algoritmkotlin.baekjoon.브루트포스

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val cardList = readLine().split(" ").map(String::toInt)
            var max = 0

            for (i in 0 until N - 2) {
                for (j in i + 1 until N - 1) {
                    for (k in j + 1 until N ) {
                        val temp = cardList[i] + cardList[j] + cardList[k]

                        if (temp in (max + 1)..M) {
                            max = temp
                        }
                    }
                }
            }

            write(max.toString())

            close()
        }
        close()
    }
}
