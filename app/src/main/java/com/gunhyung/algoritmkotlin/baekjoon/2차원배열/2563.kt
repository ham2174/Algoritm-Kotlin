package com.gunhyung.algoritmkotlin.baekjoon.`2차원배열`

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val drawingPaper: ArrayList<ArrayList<Int>> = arrayListOf()
            for (i in 0 until 100) {
                drawingPaper.add(arrayListOf())
                for (j in 0 until 100) {
                    drawingPaper[i].add(0)
                }
            }

            val value = readLine().toInt()

            for (i in 0 until value) {
                val (X, Y) = readLine().split(" ").map(String::toInt)

                for (j in X until X + 10) {
                    for (k in Y until Y + 10) {
                        drawingPaper[j][k] = 1
                    }
                }
            }

            write(drawingPaper.sumOf { it.count { num -> num == 1}  }.toString())

            close()
        }
        close()
    }
}
