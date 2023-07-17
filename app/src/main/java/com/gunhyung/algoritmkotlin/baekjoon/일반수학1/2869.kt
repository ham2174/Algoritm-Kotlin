@file:Suppress("UNUSED_CHANGED_VALUE")

package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (A, B, V) = readLine().split(" ").map(String::toInt)

            if((V - A) % (A - B) == 0) {
                write(((V - A) / (A - B) + 1).toString())
            } else {
                write(((V - A) / (A - B) + 2).toString())
            }

            close()
        }
        close()
    }
}

/*
    5미터짜리나무
    2미터씩 올라갈수 있음
    1미터씩 줄어들음

    n = 1 -> +2 = 2
    n = 2 -> (n1 - 1) + 2 = 3
    n = 3 -> (n2 - 1) + 2 = 4
 */