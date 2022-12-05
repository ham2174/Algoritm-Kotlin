package com.gunhyung.algoritmkotlin.programers

fun main() {
    val n = 12
    var answer = 0

    for (i in 1..n) {
        if (n % i == 0) {
            answer += i
            println("$i")
        }
    }

    println("$answer")
}

/*
    var answer = (1..n).filter { n % it == 0 }.sum()
    한줄 짜리 코드로 가능
 */
