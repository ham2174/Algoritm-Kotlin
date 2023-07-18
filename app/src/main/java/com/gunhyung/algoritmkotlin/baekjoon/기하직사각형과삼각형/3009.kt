package com.gunhyung.algoritmkotlin.baekjoon.기하직사각형과삼각형

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val xList = arrayListOf<Int>()
            val yList = arrayListOf<Int>()

            for (i in 0 until 3) {
                val (A, B) = readLine().split(" ").map(String::toInt)

                xList.add(A)
                yList.add(B)
            }

            val resultX = xList[0] xor xList[1] xor xList[2]
            val resultY = yList[0] xor yList[1] xor yList[2]

            write("$resultX $resultY")

            close()
        }
        close()
    }
}