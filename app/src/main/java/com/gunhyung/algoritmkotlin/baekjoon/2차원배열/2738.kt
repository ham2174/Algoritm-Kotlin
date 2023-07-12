package com.gunhyung.algoritmkotlin.baekjoon.`2차원배열`

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val A = arrayListOf<ArrayList<Int>>()
            val B = arrayListOf<ArrayList<Int>>()
            val (N, M) = readLine().split(" ").map(String::toInt)

            for (i in 0 until N * 2) {
                val value = readLine().split(" ").map(String::toInt)

                if (N - 1 < i) {
                    B.add(arrayListOf())
                    for (j in value) {
                        B[i - N].add(j)
                    }
                } else {
                    A.add(arrayListOf())
                    for (j in value) {
                        A[i].add(j)
                    }
                }
            }

            for (i in 0 until N) {
                for (j in 0 until M) {
                    val a = A[i][j]
                    val b = B[i][j]
                    write("${a + b} ")
                }
                write("\n")
            }

            close()
        }
        close()
    }
}