package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val students = (1..30).toHashSet()

            for (i in 0 until 28) {
                students.remove(readLine().toInt())
            }

            write(students.joinToString("\n"))

            close()
        }
        close()
    }
}