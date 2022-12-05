package com.gunhyung.algoritmkotlin.programers

fun main() {
    val num = 0
    val answer = if (num % 2 == 0 || num == 0) {
        "Even"
    } else {
        "Odd"
    }

    print("$answer")
}

/*
    val answer = if (num.and(1) == 0) "Even" else "Odd"
    한줄짜리 코드
 */