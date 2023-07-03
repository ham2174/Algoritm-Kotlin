package com.gunhyung.algoritmkotlin.baekjoon.입출력과사칙연산

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    val three = b % 10
    val four = b / 10 % 10
    val five = b / 100

    println(a * three)
    println(a * four)
    println(a * five)
    print(a * b)
}

/**
 * '385' 라는 문자열이 b에 입력되면 '5', '8', '3' 순으로 곱셈을 하여 값을 출력해야 하므로 reversed() 함수를 이용하여 뒤집는다.
 * 이후 뒤집어진 'b' 문자열에서 forEach 람다식을 이용해 digitToInt()를 이용하여 해당 자릿수의 문자를 Int 로 바꾼 후, 'a'의 값과 곱하여 출력한다.
 */
fun goodCase() {
    val a = readln().toInt()
    val b = readln()

    b.reversed().forEach { digitChar -> println(a * digitChar.digitToInt()) }

    print(a * b.toInt())
}

fun reference() {
    val a = readln().toInt()
    val b = readln()

    for (i in 2 downTo 0) {
        println(a * b[i].digitToInt())
    }

    print(a * b.toInt())
}
