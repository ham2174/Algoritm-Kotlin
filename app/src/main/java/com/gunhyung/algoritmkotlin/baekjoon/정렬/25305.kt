package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, k) = readLine().split(" ").map(String::toInt)
            val scores = readLine().split(" ").map(String::toInt).sortedDescending()

            write(scores[k - 1].toString())

            close()
        }
        close()
    }
}