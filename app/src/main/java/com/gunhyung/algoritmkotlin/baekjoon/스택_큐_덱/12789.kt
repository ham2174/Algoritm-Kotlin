package com.gunhyung.algoritmkotlin.baekjoon.스택_큐_덱

import java.util.LinkedList
import java.util.Scanner
import java.util.Stack

fun main() = with(Scanner(System.`in`)) {
    val N = nextInt()
    val q = LinkedList<Int>()
    val s = Stack<Int>()
    var n = 1

    repeat(N) { q.add(nextInt()) }

    while (q.isNotEmpty() || s.isNotEmpty()) {
        when {
            s.isNotEmpty() && s.peek() == n -> { s.pop(); n++ }
            q.isNotEmpty() && q.peek() == n -> { q.poll(); n++ }
            q.isNotEmpty() -> s.push(q.poll())
            else -> { println("Sad"); return }
        }
    }

    println("Nice")
}