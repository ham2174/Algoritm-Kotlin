package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val list = List(5) { readLine().toInt()}.sorted()
            var temp = 0

            repeat(5) {
                temp += list[it]
            }

            write((temp / 5).toString() + "\n" + list[2].toString())

            close()
        }
        close()
    }
}