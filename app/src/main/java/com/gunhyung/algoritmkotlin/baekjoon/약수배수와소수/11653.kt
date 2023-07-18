package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            var N = readLine().toInt()
            var temp = 2

            while (N >= 0) {
                if (N == 1) {
                    break
                } else if (N % temp == 0) {
                    write("$temp\n")
                    N /= temp
                } else {
                    temp++
                }
            }

            close()
        }
        close()
    }
}
