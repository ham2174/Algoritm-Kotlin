package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList
import java.util.Queue
import kotlin.math.min

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (X, Y) = readLine().split(" ").map(String::toInt)
            val map = Array(X) { readLine().toCharArray().map { it.code - 48 }.toIntArray() }
            val booleanRoom = Array(X) { BooleanArray(Y) { false } }
            val queue: Queue<Visited> = LinkedList()

            val dx: Array<Int> = arrayOf(1, -1, 0, 0)
            val dy: Array<Int> = arrayOf(0, 0, 1, -1)

            var result = Int.MAX_VALUE

            queue.add(Visited(0, 0, 1))

            while (queue.isNotEmpty()) {
                val (currentX, currentY, currentCount) = queue.poll()!!

                if (currentX == X - 1 && currentY == Y - 1) {
                    result = min(result, currentCount)
                }

                for (num in 0 until 4) {
                    val nextX = currentX + dx[num]
                    val nextY = currentY + dy[num]

                    if ((nextX in 0 until X) && (nextY in 0 until Y)) {
                        if (map[nextX][nextY] == 1 && !booleanRoom[nextX][nextY]) {
                            booleanRoom[nextX][nextY] = true
                            queue.add(Visited(nextX, nextY, currentCount + 1))
                        }
                    }
                }

            }

            write(result.toString())

            close()
        }
        close()
    }
}

data class Visited(
    val x: Int,
    val y: Int,
    val count: Int
)