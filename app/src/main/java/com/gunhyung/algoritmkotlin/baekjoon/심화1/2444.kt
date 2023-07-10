package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()

            for (i in 0 until 2 * N - 1) { // 줄수
                if (i >= N) { // N 이상일 때
                    for (j in N until i + 1) {
                        write(" ")
                    }

                    for (k in 0 until 2 * (N - (i - N + 1)) - 1) {
                        write("*")
                    }
                } else { // N 미만일 때
                    for (j in i + 1 until N) {
                        write(" ")
                    }

                    for (k in 0..i * 2) {
                        write("*")
                    }
                }
                write("\n")
            }

            close()
        }
        close()
    }
}

fun reference2444() {
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1))
    }
    for (i in n - 2 downTo 0) {
        println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1))
    }
}