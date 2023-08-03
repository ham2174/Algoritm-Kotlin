package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()

            sortedSetOf(
                compareBy<String> { it.length }.thenBy { it },
                *Array(N) { readLine() }).forEach {
                write(it + "\n")
            }

            close()
        }
        close()
    }
}

/*
    10번째 줄 *Array(N) { readLine() }).forEach {에서
    `*` 연산자는 spread operator로, 배열을 개별 요소로 분리하는데 사용된다.

    `sortedSetOf()`는 함수의 인자로 comparator 객체와 가변인자를 받는다.
    여기서 가변인자는 인자의 개수가 불확실하거나 리스트나 배열로 묶을 필요가
    없을때 유용하게 사용이 가능하다.
 */