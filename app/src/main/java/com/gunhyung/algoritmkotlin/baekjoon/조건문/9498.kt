package com.gunhyung.algoritmkotlin.baekjoon.조건문

fun main() {
    val score = readLine()!!.toInt()

    when {
        score >= 90 -> print("A")
        score >= 80 -> print("B")
        score >= 70 -> print("C")
        score >= 60 -> print("D")
        else -> print("F")
    }
}