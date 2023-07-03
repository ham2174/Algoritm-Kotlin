package com.gunhyung.algoritmkotlin.baekjoon.조건문

import android.annotation.SuppressLint
import java.time.LocalDate
import java.time.LocalTime

fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (b - 45 < 0) {
        b = b - 45 + 60
        if (a == 0) {
            a = 24
        }
        a -= 1
    } else {
        b -= 45
    }

    print("$a $b")
}


fun reference2884() {
    val (hour, minute) = readLine()!!.split(" ").map { it.toInt() }
    val time = LocalTime.of(hour, minute).minusMinutes(45)

    print("${time.hour} ${time.minute}")
}