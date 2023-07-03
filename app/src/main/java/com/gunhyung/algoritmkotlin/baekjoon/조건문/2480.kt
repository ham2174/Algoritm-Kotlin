package com.gunhyung.algoritmkotlin.baekjoon.조건문

/**
  list.max() 는 코틀린 1.5 버전부터 list.maxOrNull() 로 대체 되었다.
  그러나 1.? 버전 부터 다시 list.max()로 사용 가능해짐.
 */


fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    val list = listOf(a, b, c)

    when {
        a == b && b == c -> { print(10000 + (a * 1000)) }
        a == b -> { print(1000 + (a * 100)) }
        a == c -> { print(1000 + (a * 100)) }
        b == c -> { print(1000 + (b * 100)) }
        else -> { print(list.max() * 100) }
    }
}
