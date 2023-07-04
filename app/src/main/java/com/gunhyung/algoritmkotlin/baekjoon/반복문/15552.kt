package com.gunhyung.algoritmkotlin.baekjoon.반복문

import java.util.StringTokenizer

fun main() {
    val T = System.`in`.bufferedReader()
    val P = System.out.bufferedWriter()

    repeat(T.readLine().toInt()) {
        val token = StringTokenizer(T.readLine())
        P.write((token.nextToken().toInt() + token.nextToken().toInt()).toString() + "\n")
    }

    T.close()
    P.close()
}

fun reference15552() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            repeat(readLine().toInt()) {
                StringTokenizer(readLine()).apply {
                    write((nextToken().toInt() + nextToken().toInt()).toString() + "\n")
                }
            }
        }
    }
}