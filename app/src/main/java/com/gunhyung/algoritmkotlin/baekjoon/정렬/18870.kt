package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val numList = readLine().split(" ").map(String::toInt)
            val sortedNumList = numList.toSet().sorted()

            for (i in 0 until N) {
                write(sortedNumList.binarySearch(numList[i]).toString() + " ")
            }

            close()
        }
        close()
    }
}