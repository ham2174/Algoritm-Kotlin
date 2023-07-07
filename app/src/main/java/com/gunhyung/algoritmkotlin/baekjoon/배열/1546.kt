package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            var result = 0f
            val N = readLine().toInt()
            val scores = readLine().split(" ").map(String::toInt)
            val M = scores.max()

            for (element in scores) {
                result += element.toFloat() / M * 100
            }

            write((result/N).toString())

            close()
        }
        close()
    }
}
