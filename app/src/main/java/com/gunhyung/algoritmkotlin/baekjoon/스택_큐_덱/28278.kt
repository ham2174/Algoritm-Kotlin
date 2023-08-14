package com.gunhyung.algoritmkotlin.baekjoon.스택_큐_덱

import java.util.Stack

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val commandNumber = readLine().toInt()
            val stack = Stack<Int>()

            for (i in 0 until commandNumber) {
                val command = readLine().split(" ").map(String::toInt)

                when (command[0]) {
                    1 -> stack.push(command[1]) // 정수 command[1] 을 넣는다

                    2 -> {
                        if (stack.empty()) { // 없다면 -1을 대신 출력
                            write("-1\n")
                        } else { // 스택에 정수가 있다면 맨위의 정수를 빼고 출력한다.
                            val num = stack[stack.size - 1]
                            stack.pop()
                            write(num.toString() + "\n")
                        }
                    }

                    3 -> write(stack.size.toString() + "\n") // 스택에 들어있는 정수의 개수 출력

                    4 -> {
                        if (stack.empty()) { // 스택이 비어있으면 1을 출력
                            write("1\n")
                        } else { // 스택이 비어있지 않다면 0을 출력
                            write("0\n")
                        }
                    }

                    5 -> {
                        if (!stack.empty()) { // 스택에 정수가 있다면 맨 위의 정수를 출력
                            write(stack[stack.size - 1].toString() + "\n")
                        } else { // 스택에 정수가 없다면 -1을 출력
                            write("-1\n")
                        }
                    }
                }
            }

            close()
        }
        close()
    }
}

/*
    4 - 1
1 3
1 5
    3 - 2
    2 - 5
    5 - 3
    2 - 3
    2 - -1
    5 - -1
 */