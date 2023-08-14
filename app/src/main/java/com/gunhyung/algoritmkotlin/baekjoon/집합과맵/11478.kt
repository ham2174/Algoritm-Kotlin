package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val S = readLine()
            val hashSet = hashSetOf<String>()

            for (i in S.indices) {
                for (j in 0 until S.length - i) {
                    hashSet.add(S.slice(j..j + i))
                }
            }

            write(hashSet.size.toString())

            close()
        }
        close()
    }
}

/*
    a b a b c 5 / i == 1
    ab ba ab bc 4 / i == 2
    aba bab abc 3 / i == 3
    abab babc 2 / i == 4
    ababc 1 / i == 5

 */