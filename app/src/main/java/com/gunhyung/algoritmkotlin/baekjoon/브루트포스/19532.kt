package com.gunhyung.algoritmkotlin.baekjoon.브루트포스

import kotlin.math.round

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val num = readLine().split(" ").map(String::toInt)

            val a = num[0].toFloat()
            val b = num[1].toFloat()
            val c = num[2].toFloat()
            val d = num[3].toFloat()
            val e = num[4].toFloat()
            val f = num[5].toFloat()

            var x = 0f
            var y = 0f

            if (b == 0f) {
                x = c / a
                y = (f / e) - ((c * d) / (a * e))
            } else if (a == 0f) {
                x = (f / d) - ((e * c) / (b * d))
                y = c / b
            } else {
                x = (f - ((e * c) / b)) * (b / ((d * b) - (a * e)))
                y = (f - ((d * c) / a)) * (a / ((e * a) - (d * b)))
            }

            write("${round(x).toInt()} ${round(y).toInt()}")

            close()
        }
        close()
    }
}
