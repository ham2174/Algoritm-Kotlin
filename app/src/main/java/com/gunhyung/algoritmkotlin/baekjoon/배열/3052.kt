package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            ArrayList<Int>().apply {
                repeat(10) { this.add(readLine().toInt() % 42) }
            }.also {
                write(it.distinct().size.toString()) }

            close()
        }
        close()
    }
}