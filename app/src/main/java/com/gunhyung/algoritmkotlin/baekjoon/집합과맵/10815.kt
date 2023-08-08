package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val cardSet = readLine().split(" ").map(String::toInt).toHashSet()
            val M = readLine().toInt()

            readLine().split(" ").map(String::toInt).forEach {
                if (cardSet.contains(it)) write("1 ")
                else write("0 ")
            }

            close()
        }
        close()
    }
}