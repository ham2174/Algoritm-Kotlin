package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val adjList = Array(N + 1) { ArrayList<Int>() }
            val parent = IntArray(N + 1) { 0 }

            for (i in 0 until N - 1) {
                val (a, b) = readLine().split(" ").map(String::toInt)
                adjList[a].add(b)
                adjList[b].add(a)
            }

            for (i in 2..N) {
                write("${bfs(parent, adjList)[i]}\n")
            }

            close()
        }
        close()
    }
}

private fun bfs(
    parent: IntArray,
    adjList: Array<ArrayList<Int>>
): IntArray {
    val queue = LinkedList<Int>()
    queue.add(1)
    parent[1] = 0

    while (queue.isNotEmpty()) {
        val curNode = queue.poll()!!

        for (i in adjList[curNode]) {
            if (parent[i] == 0) {
                parent[i] = curNode
                queue.add(i)
            }
        }
    }

    return parent
}
