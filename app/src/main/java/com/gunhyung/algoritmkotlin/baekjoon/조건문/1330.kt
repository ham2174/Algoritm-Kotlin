package com.gunhyung.algoritmkotlin.baekjoon.조건문

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a > b) {
        print(">")
    } else if (a < b) {
        print("<")
    } else {
        print("==")
    }
}

fun reference1330() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    when {
        a > b -> print(">")
        a < b -> print("<")
        else -> print("==")
    }
}