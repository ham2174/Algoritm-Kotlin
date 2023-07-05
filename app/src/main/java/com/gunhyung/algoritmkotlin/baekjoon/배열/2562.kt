package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val arrayList = ArrayList<Int>()

            for (i in 0 until 9) {
                arrayList.add(readLine().toInt())
            }

            val max = arrayList.max()

            write(max.toString() + "\n" + (arrayList.indexOf(max) + 1).toString())
            close()
        }
        close()
    }
}