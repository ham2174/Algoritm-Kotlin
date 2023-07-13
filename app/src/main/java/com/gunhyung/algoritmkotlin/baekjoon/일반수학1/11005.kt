package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, B) = readLine().split(" ").map(String::toInt)

            write(N.toString(B).uppercase())

            close()
        }
        close()
    }
}