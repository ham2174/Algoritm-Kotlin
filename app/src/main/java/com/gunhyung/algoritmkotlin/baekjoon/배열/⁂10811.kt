package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val result = ArrayList<Int>().apply { repeat(N) { add(it+1) } }

            for (a in 0 until M) {
                // 입력
                val (i, j) = readLine().split(" ").map(String::toInt)
                var temp = 0

                // 입력한 범위 복사 및 리버스
                val copyRange = ArrayList<Int>().apply {
                    for (b in i-1 until j) {
                        add(result[b])
                    }
                    reverse()
                }

                // 덮어 쓰기
                for (c in i-1 until j) {
                    result[c] = copyRange[temp]
                    temp += 1
                }
            }

            write(result.joinToString(" "))

            close()
        }
        close()
    }
}

/**
 * ArrayList가 아닌 Array에서 rangeReverse를 제공한다.
 * Array.reverse(A, B)의 사용 방법은 A until B 이다.
 * A이상 B미만의 인덱스 범위를 뒤집는다.
 */
fun reference10811() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val result = Array(N) { it + 1 }

            for (a in 1..M) {
                val (i, j) = readLine().split(" ").map(String::toInt)
                result.reverse(i-1, j)
            }

            write(result.joinToString(" "))

            close()
        }
        close()
    }
}