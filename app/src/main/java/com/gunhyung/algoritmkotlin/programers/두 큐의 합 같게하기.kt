package com.gunhyung.algoritmkotlin.programers

import java.util.LinkedList
import java.util.Queue

class `두큐의합같게하기` {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var answer = 0

        val q1 = LinkedList<Long>().apply { queue1.forEach { add(it.toLong()) } }
        val q2 = LinkedList<Long>().apply { queue2.forEach { add(it.toLong()) } }

        var q1Total = q1.sum()
        var q2Total = q2.sum()

        while (answer <= queue1.size * 4) {
            if (q1Total == q2Total) {
                return answer
            }

            answer++

            when {
                q1Total > q2Total -> {
                    val temp = q1.removeFirst()
                    q2.add(temp)
                    q2Total += temp
                    q1Total -= temp
                }
                else -> {
                    val temp = q2.removeFirst()
                    q1.add(temp)
                    q1Total += temp
                    q2Total -= temp
                }
            }
        }

        return -1
    }
}

fun main() {
    var answer = -2

    val queue1 = intArrayOf(1,2,3,4)
    val queue2 = intArrayOf(1,2,3,4)

    val q1 = LinkedList<Int>()
    val q2 = LinkedList<Int>()

    q1.addAll(queue1.toList())
    q2.addAll(queue2.toList())

    println(q1.sum().toString())
    println(q2.toString())

}