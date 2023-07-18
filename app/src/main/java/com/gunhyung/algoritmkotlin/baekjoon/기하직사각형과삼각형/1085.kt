package com.gunhyung.algoritmkotlin.baekjoon.기하직사각형과삼각형

import kotlin.math.min

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (x, y, w, h) = readLine().split(" ").map(String::toInt)

            val value0 = w - x
            val value1 = h - y

            write(min(x, min(y, min(value1, value0))).toString())

            close()
        }
        close()
    }
}