package com.gunhyung.algoritmkotlin.baekjoon.정렬

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val meetings = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (startTime, endTime) = br.readLine().split(" ")
        meetings.add(Pair(startTime.toInt(), endTime.toInt()))
    }

    // 끝나는 시간 기준으로 정렬, 끝나는 시간이 같으면 시작 시간 기준으로 정렬
    val sortedMeetings =
        meetings.sortedWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })

    var count = 0
    var lastEndTime = 0

    for (i in sortedMeetings.indices) {
        if (sortedMeetings[i].first >= lastEndTime) {
            count++
            lastEndTime = sortedMeetings[i].second
        }
    }

    println(count)
}
