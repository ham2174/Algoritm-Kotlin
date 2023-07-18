package com.gunhyung.algoritmkotlin.baekjoon.기하직사각형과삼각형

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val A = readLine().toInt()
            val B = readLine().toInt()

            write((A * B).toString())

            close()
        }
        close()
    }
}