package com.gunhyung.algoritmkotlin.baekjoon.dp

/*
    4 7
    6 13
    4 8
    3 6
    5 12
 */
fun main() {
    val (N, maxWeight) = readln().split(" ").map { it.toInt() }

    val items: Array<Pair<Int, Int>> = Array(N) {
        val (weight, value) = readln().split(" ").map { it.toInt()}
        weight to value
    }

    // DP 배열의 의미는 현재 배낭의 무게의 최대 가치를 의미
    // dp[0] 이란 배낭이 0kg 일 때 최대 가치를 의미
    // 마찬 가지로 dp[n]은 배낭의 현재 무게가 `n`kg일 때 최대 가치를 의미 한다.
    // maxWeight + 1로 사이즈를 초기화 한 이유는, 문제에서 구하고자 하는 배낭의 최대 무게가 7 이기 때문에
    // dp[maxWeight]의 값을 알기 위해선 배열의 인덱스는 0부터 시작이므로 +1을 해준다.
    val dp = IntArray(maxWeight + 1)

    for ((weight, value) in items) {
        for (j in maxWeight downTo weight) {
            dp[j] = maxOf(dp[j], dp[j - weight] + value)
        }
    }

    println(dp[maxWeight])
}
