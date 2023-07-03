package com.gunhyung.algoritmkotlin.baekjoon

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    println((a + b) % c)
    println(((a % c) + (b % c)) % c)
    println((a * b) % c)
    print(((a % c) * (b % c)) % c)
}