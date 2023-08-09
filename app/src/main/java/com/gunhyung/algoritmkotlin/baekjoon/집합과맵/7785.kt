package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val n = readLine().toInt()
            val historyMap = hashMapOf<String, String>()
            val result = arrayListOf<String>()

            for (i in 0 until n) {
                val (name, history) = readLine().split(" ")

                historyMap[name] = history
            }

            historyMap.forEach {
                if (it.value == "enter") {
                    result.add(it.key)
                }
            }

            write(result.sortedDescending().joinToString("\n"))

            close()
        }
        close()
    }
}