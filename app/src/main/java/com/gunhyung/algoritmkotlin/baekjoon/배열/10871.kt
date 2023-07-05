package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, X) = readLine().split(" ").map(String::toInt)
            val A = readLine().split(" ").map(String::toInt)

            for (i in 0 until N) {
                if (A[i] < X) {
                    write(A[i].toString() + " ")
                }
            }

            close()
        }
        close()
    }
}
