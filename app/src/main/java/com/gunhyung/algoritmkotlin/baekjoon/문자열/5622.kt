package com.gunhyung.algoritmkotlin.baekjoon.문자열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val hashMap = mutableMapOf<Char, Int>()
            ('A'..'Z').toList().forEachIndexed { index, c ->
                when (c) {
                    'S' -> hashMap[c] = 8
                    'V' -> hashMap[c] = 9
                    'Y', 'Z' -> hashMap[c] = 10
                    else -> hashMap[c] = (index / 3) + 3
                }
            }
            var result = 0
            for (i in readLine()) {
                result += hashMap[i] ?: 0
            }

            write(result.toString())

            close()
        }
        close()
    }
}

fun reference5622() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            write(readLine().sumOf {
                when (it) {
                    in 'A'..'C' -> 3
                    in 'D'..'F' -> 4
                    in 'G'..'I' -> 5
                    in 'J'..'L' -> 6
                    in 'M'..'O' -> 7
                    in 'P'..'S' -> 8
                    in 'T'..'V' -> 9
                    else -> 10
                }.toInt()
            }.toString())

            close()
        }
        close()
    }
}