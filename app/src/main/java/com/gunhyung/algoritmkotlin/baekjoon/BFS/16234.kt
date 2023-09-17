package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList
import kotlin.math.abs

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, L, R) = readLine().split(" ").map(String::toInt)
            val map = Array(N) { readLine().split(" ").map(String::toInt).toIntArray() }
            var day = 0

            while (true) {
                var borderOpen = false
                val visited = Array(N) { BooleanArray(N) { false } }
                val unionList = ArrayList<Union>()

                for (x in 0 until N) {
                    for (y in 0 until N) {
                        if (visited[x][y]) continue
                        visited[x][y] = true

                        val union = bfs(map, visited, x, y, L, R)
                        unionList.add(union)
                    }
                }

                unionList.forEach { (sum, list) ->
                    if (list.size > 1) {
                        borderOpen = true
                    }
                    list.forEach { (x, y) ->
                        map[x][y] = sum / list.size
                    }
                }

                if (!borderOpen) {
                    break
                } else {
                    day++
                }
            }

            write(day.toString())

            close()
        }
        close()
    }
}

private fun bfs(
    map: Array<IntArray>,
    visited: Array<BooleanArray>,
    curX: Int,
    curY: Int,
    L: Int,
    R: Int
): Union {
    val union = Union(
        sum = map[curX][curY],
        unionList = arrayListOf(Node(curX, curY))
    )
    val queue = LinkedList<Node>()

    val dx = listOf(0,1,0,-1)
    val dy = listOf(-1,0,1,0)

    queue.add(Node(curX, curY))

    while (queue.isNotEmpty()) {
        val (x, y) = queue.poll()!!

        for (i in 0 until 4) {
            val nextX = x + dx[i]
            val nextY = y + dy[i]

            if (nextX in map.indices && nextY in map.indices) { // 다음 X, Y 좌표가 맵 안에 위치해 있는가?
                val peopleDiff = abs(map[x][y] - map[nextX][nextY])
                if (!visited[nextX][nextY] && peopleDiff in L..R) { // 방문해본적 없는 노드이고, 현위치와 다음 위치의 인구차이가 L이상 R이하 인가?
                    visited[nextX][nextY] = true
                    queue.add(Node(nextX, nextY))
                    union.sum += map[nextX][nextY]
                    union.unionList.add(Node(nextX, nextY))
                }
            }
        }
    }

    return union
}

data class Union(
    var sum: Int = 0,
    val unionList: ArrayList<Node> = arrayListOf()
)

data class Node(
    val x: Int,
    val y: Int
)