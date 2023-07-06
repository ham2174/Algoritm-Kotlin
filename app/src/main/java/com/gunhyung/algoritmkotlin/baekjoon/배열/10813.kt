package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val result = ArrayList<Int>(N)

            for (i in 1..N) {
                result.add(i)
            }

            for (a in 0 until M) {
                val (i, j) = readLine().split(" ").map(String::toInt)
                val temp = result[i-1]
                result[i-1] = result[j-1]
                result[j-1] = temp
            }

            write(result.joinToString(" "))

            close()
        }
        close()
    }
}

fun reference10813() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val result = IntArray(N) { it + 1} // IntArray는 불변형이기 때문에 초기화 이후에 값을 추가 삭제 할 수 없다.

            for (a in 0 until M) {
                val (i, j) = readLine().split(" ").map(String::toInt)
                val temp = result[i-1]
                result[i-1] = result[j-1]
                result[j-1] = temp
            }

            write(result.joinToString(" "))

            close()
        }
        close()
    }
}