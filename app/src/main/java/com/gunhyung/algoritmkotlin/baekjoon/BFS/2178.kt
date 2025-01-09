package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList
import java.util.Queue
import kotlin.math.min
import kotlin.math.pow

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

/*
fun main() { // 메모리 초과 코드
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val map = Array(N) { readLine().toCharArray().map { it.code - 48 }.toIntArray() }
            val booleanRoom = Array(N) { BooleanArray(M) { false } }
            val queue = LinkedList<Visited>()
            var result = Int.MAX_VALUE
            var temp = 0
            val dx: Array<Int> = arrayOf(1, -1, 0, 0)
            val dy: Array<Int> = arrayOf(0, 0, 1, -1)


            queue.add(Visited(0, 0, 1))

            while (queue.isNotEmpty()) {
                val (currentX, currentY, currentCount) = queue.poll()!!

                if (currentX == N - 1 && currentY == M - 1) {
                    result = min(result, currentCount)
                }

                if (!booleanRoom[currentX][currentY]) {
                    booleanRoom[currentX][currentY] = true

                    for (num in 0 until 4) {
                        val nextX = currentX + dx[num]
                        val nextY = currentY + dy[num]

                        if ((nextX) in 0 until N && (nextY) in 0 until M) {
                            if (map[nextX][nextY] != 0) {
                                queue.add(Visited(nextX, nextY, currentCount + 1))
                            }
                        }
                    }
                }

                temp++
            }

            write(temp.toString() + "\n")
            write(result.toString())

            close()
        }
        close()
    }
}

 */