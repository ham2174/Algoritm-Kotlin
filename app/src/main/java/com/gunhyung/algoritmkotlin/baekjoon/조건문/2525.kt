package com.gunhyung.algoritmkotlin.baekjoon.조건문

fun main() {
    val currentTime = readLine()!!.split(" ").map { it.toInt() }
    val cookingTime = readLine()!!.toInt()
    val temp: Int = (cookingTime + currentTime[1]) / 60

    val resultTime = if (currentTime[0] + temp >= 24) {
        currentTime[0] + temp - 24
    } else {
        currentTime[0] + temp
    }
    val resultMinute = if (currentTime[1] + (cookingTime % 60) >= 60) {
        currentTime[1] + (cookingTime % 60) - 60
    } else {
        currentTime[1] + (cookingTime % 60)
    }

    print("$resultTime $resultMinute")
}

fun reference2525() {
    val (currentTime, currentMinute) = List(2){ readln().split(" ").map { it.toInt() } }
    var (hour, minute) = currentTime

    minute += currentMinute[0]
    hour += minute / 60

    print("${hour % 24}  ${minute % 60}")
}