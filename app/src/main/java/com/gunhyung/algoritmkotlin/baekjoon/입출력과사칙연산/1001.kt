package com.gunhyung.algoritmkotlin.baekjoon.입출력과사칙연산

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    print(a - b)
}
