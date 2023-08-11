package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val hashMap = hashMapOf<String, Int>()
            val result = arrayListOf<String>()

            for (i in 0 until N) {
                val noHearHuman = readLine()
                hashMap[noHearHuman] = i
            }

            for (i in 0 until M) {
                val noSeeHuman = readLine()

                if (hashMap.contains(noSeeHuman)) {
                    result.add(noSeeHuman)
                }
            }

            write(result.size.toString() + "\n")

            result.sorted().forEach {
                write(it + "\n")
            }

            close()
        }
        close()
    }
}