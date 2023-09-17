package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val map = Array(N) { readLine().split(" ").map(String::toInt).toIntArray() }
            var year = 0
            var isTwoPieces = false

            while (true) {
                val visited2 = Array(N) { BooleanArray(M) { false } }
                var pieces = 0
                val result = ArrayList<Point>()

                for (x in 0 until N) {
                    for (y in 0 until M) {
                        if (map[x][y] != 0) {
                            val water = explore(map, x, y, N, M) // 녹여야되는 좌표와 녹여야할 값을 저장
                            if (water != null) {
                                result.add(Point(x, y, water))
                            }
                        }
                    }
                }

                if (result.isEmpty()) {
                    break
                }

                result.forEach { (x, y, water) -> // 빙산을 녹이는 작업
                    map[x][y] -= water
                    if (map[x][y] < 0) {
                        map[x][y] = 0
                    }
                }

                year++

                for (x in 0 until N) {
                    for (y in 0 until M) {
                        if (map[x][y] == 0) {
                            visited2[x][y] = true
                        } else if (map[x][y] != 0 && !visited2[x][y]) {
                            bfs2(map, visited2, x, y, N, M)
                            pieces++
                        }
                    }
                }

                if (pieces >= 2) {
                    isTwoPieces = true
                    break
                }
            }

            if (isTwoPieces) {
                write(year.toString())
            } else {
                write("0")
            }

            close()
        }
        close()
    }
}

val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

private fun explore(
    map: Array<IntArray>,
    x: Int,
    y: Int,
    N: Int,
    M: Int
): Int? {
    var water = 0

    for (i in 0 until 4) {
        val nextX = x + dx[i]
        val nextY = y + dy[i]

        if (nextX in 0 until N && nextY in 0 until M) { // 맵 안에 있는지 체크
            if (map[nextX][nextY] == 0) {
                water++
            }
        }
    }

    return if (water > 0) {
        water
    } else {
        null
    }
}

private fun bfs2(
    map: Array<IntArray>,
    visited2: Array<BooleanArray>,
    x: Int,
    y: Int,
    N: Int,
    M: Int
) {
    val queue = LinkedList<Node>()

    queue.add(Node(x, y))
    visited2[x][y] = true

    while (queue.isNotEmpty()) {
        val (curX, curY) = queue.poll()!!

        for (i in 0 until 4) {
            val nextX = curX + dx[i]
            val nextY = curY + dy[i]

            if (nextX in 0 until N && nextY in 0 until M) {
                if (map[nextX][nextY] != 0 && !visited2[nextX][nextY]) {
                    visited2[nextX][nextY] = true
                    queue.add(Node(nextX, nextY))
                }
            }
        }
    }
}

data class Point(
    val x: Int,
    val y: Int,
    val water: Int
)

/*data class Node(
    val x: Int,
    val y: Int
)*/