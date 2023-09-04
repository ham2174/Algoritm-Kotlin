package com.gunhyung.algoritmkotlin.baekjoon.스택_큐_덱

import java.util.Stack

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val K = readLine().toInt()
            val stack = Stack<Int>()

            for (i in 0 until K) {
                val num = readLine().toInt()

                if (num == 0 && !stack.empty()) {
                    stack.pop()
                } else {
                    stack.push(num)
                }
            }

            write(stack.sum().toString())

            close()
        }
        close()
    }
}