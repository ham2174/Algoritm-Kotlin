package com.gunhyung.algoritmkotlin.baekjoon.스택_큐_덱

import java.util.Stack

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val stack = Stack<Char>()

            while (true) {
                val string = readLine()

                if (string == ".") {
                    break
                }

                var isBalanced = true

                for (currentChar in string) {
                    when (currentChar) {
                        '(', '[' -> stack.push(currentChar)
                        ')' -> if (stack.isNotEmpty() && stack.peek() == '(') stack.pop() else isBalanced = false
                        ']' -> if (stack.isNotEmpty() && stack.peek() == '[') stack.pop() else isBalanced = false
                    }

                    if (!isBalanced) break
                }

                if (isBalanced && stack.isEmpty()) {
                    write("yes\n")
                } else {
                    write("no\n")
                }

                flush()

                stack.clear()
            }

            close()
        }
        close()
    }
}