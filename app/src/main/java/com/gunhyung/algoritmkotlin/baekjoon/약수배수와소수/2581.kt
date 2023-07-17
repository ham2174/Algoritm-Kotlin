package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

import kotlin.math.sqrt

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val M = readLine().toInt()
            val N = readLine().toInt()
            var total = 0
            var minValue = 0

            for (i in M..N) {
                if (isPrime(i)) {
                    total += i
                    if (minValue == 0) {
                        minValue = i
                    }
                }
            }

            if (total == 0) {
                write("-1")
            } else {
                write("$total\n$minValue")
            }

            close()
        }
        close()
    }
}

fun isPrime(num: Int) : Boolean {
    if (num <= 1) return false
    for (i in 2 until Math.sqrt(num.toDouble()).toInt() + 1) {
        if (num % i == 0) return false
    }
    return true
}