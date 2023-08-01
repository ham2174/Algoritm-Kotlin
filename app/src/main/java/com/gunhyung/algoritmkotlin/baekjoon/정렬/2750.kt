package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val list = arrayListOf<Int>()

            for (i in 0 until N) {
                list.add(readLine().toInt())
            }

            list.sorted().let { intList ->
                intList.forEachIndexed { index, _ ->
                    write(intList[index].toString() + "\n")
                }
            }

            close()
        }
        close()
    }
}