package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList
import kotlin.math.min

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (X, Y) = readLine().split(" ").map(String::toInt)
            val map = Array(X){ readLine().toCharArray().map { it.code - 48 }.toIntArray() }
            val visitedRoom = Array(X) { Array(Y) { BooleanArray(2) { false } } }
            val queue = LinkedList<CurrentState>()

            val dx = arrayOf(0, 0, -1, 1)
            val dy = arrayOf(1, -1, 0, 0)
            var result = Int.MAX_VALUE

            queue.add(CurrentState(0, 0, 1, false))
            visitedRoom[0][0][0] = true

            while (queue.isNotEmpty()) {
                val (curX, curY, count, visitedOne) = queue.poll()!!

                if (curX == X - 1 && curY == Y - 1) {
                    result = min(result, count)
                }

                for (i in 0 until 4) {
                    val nextX = curX + dx[i]
                    val nextY = curY + dy[i]

                    if (nextX in 0 until X && nextY in 0 until Y) {
                        val visitIndex = if (visitedOne) 1 else 0

                        if (map[nextX][nextY] == 0 && !visitedRoom[nextX][nextY][visitIndex]) {
                            visitedRoom[nextX][nextY][visitIndex] = true
                            queue.add(CurrentState(nextX, nextY, count + 1, visitedOne))
                        } else if (map[nextX][nextY] == 1 && !visitedOne && !visitedRoom[nextX][nextY][1]) {
                            visitedRoom[nextX][nextY][1] = true
                            queue.add(CurrentState(nextX, nextY, count + 1, true))
                        }
                    }
                }
            }

            if (result == Int.MAX_VALUE) {
                write("-1")
            } else {
                write(result.toString())
            }

            close()
        }
        close()
    }
}

data class CurrentState(
    val x: Int,
    val y: Int,
    val count: Int,
    val visitedOne: Boolean
)