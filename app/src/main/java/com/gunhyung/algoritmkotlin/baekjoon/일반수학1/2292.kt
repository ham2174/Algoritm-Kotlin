package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()

            for (i in 1..18258) {
                if ((3 * i * i) - (3 * i) + 2 > N) {
                    write(i.toString())
                    break
                }
            }

            close()
        }
        close()
    }
}

/**
 * 계차수열을 이해해야 풀 수 있는 문제.
 * 3n^2 - 3n + 2 라는 공식을 만들어야함.
 * while 문을 통해 계차수열을 만들어 보는 상황을 만들어보자.
 */

fun reference2292() {
    var n = readln().toInt()
    var i = 1

    while(n > 1) {
        n -= i++ * 6
    }

    print(i)
}
