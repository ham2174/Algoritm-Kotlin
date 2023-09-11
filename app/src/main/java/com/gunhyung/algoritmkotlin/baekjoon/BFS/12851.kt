package com.gunhyung.algoritmkotlin.baekjoon.BFS

import java.util.LinkedList

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (currentPoint, destinyPoint) = readLine().split(" ").map(String::toInt)
            val visited = BooleanArray(100_001)
            val queue = LinkedList<Pair<Int, Int>>()

            var count = 0
            var min = Int.MAX_VALUE

            queue.add(Pair(currentPoint, 0))
            visited[currentPoint] = true

            while (queue.isNotEmpty()) {
                val (newPoint, second) = queue.poll()!!

                visited[newPoint] = true

                if (newPoint == destinyPoint) {
                    if (min > second) {
                        min = second
                        count = 1
                    } else if (min == second) {
                        count++
                    }
                    continue
                }

                val go = newPoint + 1
                val back = newPoint - 1
                val tp = newPoint * 2

                if ((go) in 0..100_000 && !visited[go]) {
                    queue.add(Pair(go, second + 1))
                }
                if ((back) in 0..100_000 && !visited[back]) {
                    queue.add(Pair(back, second + 1))
                }
                if (tp in 0..100_000 && !visited[tp]) {
                    queue.add(Pair(tp, second + 1))
                }
            }

            write("$min\n$count")

            close()
        }
        close()
    }
}