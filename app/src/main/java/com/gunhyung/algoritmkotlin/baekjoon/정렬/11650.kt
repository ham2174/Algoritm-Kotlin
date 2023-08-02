package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val node = ArrayList<ArrayList<Int>>()

            for (i in 0 until N) {
                val (x, y) = readLine().split(" ").map(String::toInt)

                node.add(arrayListOf(x, y))
            }

            node.sortedWith(compareBy<ArrayList<Int>> { it.first() }.thenBy { it.last() })
                .forEach {
                    write("${it.first()} ${it.last()}\n")
                }

            close()
        }
        close()
    }
}

/*
fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val node = Array<Node?>(N) { null }

            for (i in 0 until N) {
                val (x, y) = readLine().split(" ").map(String::toInt)

                node[i] = Node(x, y)
            }

            node.sortedWith(compareBy<Node?> { it!!.x }.thenBy { it!!.y })
                .forEach {
                    write("${it!!.x} ${it.y}\n")
                }

            close()
        }
        close()
    }
}

data class Node(
    val x: Int,
    val y: Int
)
 */