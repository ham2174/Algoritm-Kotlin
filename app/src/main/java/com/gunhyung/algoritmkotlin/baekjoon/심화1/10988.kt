package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val word = readLine()

            when (word.equals(word.reversed())) {
                true -> write("1")
                false -> write("0")
            }

            close()
        }
        close()
    }
}