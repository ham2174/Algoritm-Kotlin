package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val T = readLine().toInt()

            for (i in 0 until T) {
                val (R, S) = readLine().split(" ")

                for (j in S) {
                    for (k in 0 until R.toInt()) {
                        write(j.toString())
                    }
                }
                write("\n")
            }

            close()
        }
        close()
    }
}