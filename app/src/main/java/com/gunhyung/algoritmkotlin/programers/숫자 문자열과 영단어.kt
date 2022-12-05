package com.gunhyung.algoritmkotlin.programers

fun main() {
    val s = "23four5six7"
    val answer = s
        .replace("zero","0")
        .replace("one","1")
        .replace("two","2")
        .replace("three","3")
        .replace("four","4")
        .replace("five","5")
        .replace("six","6")
        .replace("seven","7")
        .replace("eight","8")
        .replace("nine","9")

    print("${answer.toInt()}")
}
