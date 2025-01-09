package com.gunhyung.algoritmkotlin.inflearn

import kotlin.math.pow

fun main() {
    val N = 25f // 숫자 N이 주어진다.

    val answer = N.pow(0.5f).toInt() // N의 0.5 제곱은 1부터 N 까지의 제곱수의 갯수 같다.

    println(answer)
}

// 제곱수의 갯수란 1, 4, 9, 16, 25 등 정수 n의 제곱값을 의미
// 1부터 N 까지의 제곱수의 갯수는 루트 N 과 같다.
// 루트 N = N 의 0.5 제곱 = N.pow(0.5f)
// pow는 제곱 함수