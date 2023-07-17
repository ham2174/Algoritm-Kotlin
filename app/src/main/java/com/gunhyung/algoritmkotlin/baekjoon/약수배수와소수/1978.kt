package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val num = readLine().split(" ").map(String::toInt)
            var result = 0

            for (i in 0 until N) {
                result++

                if (num[i] == 1) {
                    result--
                    continue
                }
                else {
                    for (j in 1..num[i]) {
                        if (num[i] % j == 0 && j != 1 && j != num[i]) {
                            if (result != 0) {
                                result--
                            }
                            break
                        }
                    }
                }
            }

            write(result.toString())

            close()
        }
        close()
    }
}