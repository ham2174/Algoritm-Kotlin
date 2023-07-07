package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val T = readLine().toInt()

            for (i in 0 until T) {
                val value = readLine()
                write(value[0].toString() + value[value.length-1].toString() + "\n")
            }

            close()
        }
        close()
    }
}