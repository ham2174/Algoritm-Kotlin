package com.gunhyung.algoritmkotlin.baekjoon.반복문

import java.util.StringTokenizer

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            repeat(readLine().toInt()) {
                StringTokenizer(readLine()).apply {
                    write((nextToken().toInt() + nextToken().toInt()).toString() + "\n")
                }
            }
            close()
        }
        close()
    }
}

fun reference15552() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            repeat(readLine().toInt()) {
                StringTokenizer(readLine()).apply {
                    write((nextToken().toInt() + nextToken().toInt()).toString() + "\n")
                }
            }
            close()
        }
        close()
    }

}