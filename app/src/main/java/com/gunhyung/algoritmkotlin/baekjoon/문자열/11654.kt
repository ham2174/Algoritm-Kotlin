package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val value = readLine()

            write(value[0].code.toByte().toInt().toString())

            close()
        }
        close()
    }
}