package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val node = ArrayList<ArrayList<Int>>()

            for (i in 0 until N) {
                val (x, y) = readLine().split(" ").map(String::toInt)

                node.add(arrayListOf(x, y))
            }

            node.sortWith(compareBy<ArrayList<Int>> { it.last() }.thenBy { it.first() })

            for (i in 0 until N) {
                write("${node[i].first()} ${node[i].last()}\n")
            }

            close()
        }
        close()
    }
}