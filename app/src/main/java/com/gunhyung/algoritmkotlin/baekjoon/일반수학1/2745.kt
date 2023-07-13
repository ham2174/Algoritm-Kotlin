package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, B) = readLine().split(" ")

            write(N.toInt(B.toInt()).toString())

            close()
        }
        close()
    }
}