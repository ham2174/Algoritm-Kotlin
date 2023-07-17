package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {

            while (true) {
                val (A, B) = readLine().split(" ").map(String::toInt)

                if (A == 0 && B == 0) break
                else {
                    if (B % A == 0) {
                        write("factor\n")
                    } else if (A % B == 0) {
                        write("multiple\n")
                    } else {
                        write("neither\n")
                    }
                }
            }

            close()
        }
        close()
    }
}