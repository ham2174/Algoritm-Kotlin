package com.gunhyung.algoritmkotlin.inflearn

import kotlin.math.pow

fun main() {
    val N = 36
    val arr1 = mutableSetOf<Int>()
    val arr2 = mutableSetOf<Int>()

    // 정수 N의 약수 구하기
    for (i in 1..N) {
        if (N % i == 0) {
            arr1.add(i)
        }
        println(i)
    }

    println(arr1)
    println("============")

    // 효율이 좋은 정수 N의 약수 구하기
    val squareNumber = N.toFloat().pow(0.5f).toInt() // 1 부터 N 까지의 제곱수의 갯수

    for (j in 1..squareNumber + 1) { // 제곱수의 갯수 + 1개 만큼 반복
        if (N % j == 0) {
            arr2.add(j) // 나누어 떨어진 j는 N의 약수
            arr2.add(N / j) // N을 j로 나눈것도 N의 약수
       }
        println(j)
    }
    println(arr2.toSortedSet())
}