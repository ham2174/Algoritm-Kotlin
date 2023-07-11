package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val word = readLine().lowercase()
            val map = ('a'..'z').associateWith { 0 }.toMutableMap()

            for (i in word) {
                map[i] = (map[i] ?: 0) + 1
            }

            val manyAlphabet = map.maxOf { it.value }
            var result: Char? = null

            for (i in map.keys) {
                if (map[i] == manyAlphabet) {
                    result =
                        if (result != null) '?'
                        else i
                }
            }

            write(result?.uppercase())

            close()
        }
        close()
    }
}