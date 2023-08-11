package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val cardNumList = readLine().split(" ").map(String::toInt).groupingBy { it }.eachCount()
            val M = readLine().toInt()
            val numList = readLine().split(" ").map(String::toInt)

            for (i in 0 until M) {
                write("${cardNumList[numList[i]] ?: 0} ")
            }

            close()
        }
        close()
    }
}