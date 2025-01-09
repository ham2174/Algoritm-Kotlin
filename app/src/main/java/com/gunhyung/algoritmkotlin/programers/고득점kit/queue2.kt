package com.gunhyung.algoritmkotlin.programers.고득점kit

import java.util.LinkedList

fun main() {
    val priorities = intArrayOf(1, 1, 9, 1, 1, 1)
    val location = 0

    val queue = LinkedList(priorities.mapIndexed { index, priority -> index to priority })
    val answer = ArrayList<Pair<Int, Int>>()
    val target = queue[location]

    while (queue.isNotEmpty()) {
        val temp = queue.pop()
        val maxValue = queue.maxOfOrNull { pair -> pair.second }

        if (maxValue == null) {
            answer.add(temp)
            break
        }

        if (temp.second >= maxValue) answer.add(temp)
        else queue.add(temp)
    }

    println(answer.indexOf(target) + 1)

}