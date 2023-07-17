package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, K) = readLine().split(" ").map(String::toInt)
            val divisorList = arrayListOf<Int>()

            for (i in 1..N) {
                if (N % i == 0) {
                    divisorList.add(i)
                }
            }

            if (divisorList.size < K) write("0")
            else write(divisorList[K - 1].toString())

            close()
        }
        close()
    }
}