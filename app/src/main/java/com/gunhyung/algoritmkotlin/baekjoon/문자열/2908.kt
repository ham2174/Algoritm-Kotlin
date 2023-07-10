package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (A, B) = readLine().split(" ").map { it.reversed().toInt() }

            write(maxOf(A,B).toString())

            close()
        }
        close()
    }
}