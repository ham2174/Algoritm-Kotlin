package com.gunhyung.algoritmkotlin.baekjoon.브루트포스

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = br.readLine() ?: break
        val n = line.toInt()

        var num = 1 % n
        var length = 1

        while(num != 0) {
            num = ((num * 10) + 1) % n
            length += 1
        }
        val test = hashMapOf<Int, Int>()
        val qwe = test.maxByOrNull { it.value }
        qwe

        print(length)
    }
}
