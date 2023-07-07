package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val S = readLine()
            val i = readLine().toInt()

            write(S[i-1].toString())

            close()
        }
        close()
    }
}