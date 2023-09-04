package com.gunhyung.algoritmkotlin.baekjoon.스택_큐_덱

import java.util.Stack

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val T = readLine().toInt()
            val stack = Stack<Char>()

            for (i in 0 until T) {
                val words = readLine()

                for (j in words.indices) {
                    stack.push(words[j])

                    if (stack[0] == ')') {
                        break
                    } else if (words[j] == ')') {
                        stack.pop()
                        stack.pop()
                    }
                }

                if (stack.empty()) {
                    write("YES\n")
                } else {
                    write("NO\n")
                }

                stack.clear()
            }

            close()
        }
        close()
    }
}