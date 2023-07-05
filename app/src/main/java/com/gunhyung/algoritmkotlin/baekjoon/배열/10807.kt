package com.gunhyung.algoritmkotlin.baekjoon.배열

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val values = readLine().split(" ").map(String::toInt)
            val V = readLine().toInt()

            write(values.count { it == V}.toString())

            close()
        }
        close()
    }
}

/**
    List → ArrayList로 변환하는 방법
    1. .toCollection(ArrayList())
    2. val arrayList = ArrayList(List)

    -타입 캐스팅-
    [val value = readLine().split(" ").map(String::toInt) as ArrayList<Int>]
    위 코드가 오류가 발생되지 않는 이유는 [map] 함수의 내부 구현때문이다. [map] 함수는 List를 반환하지만
    내부적으로 ArrayList를 사용하여 결과를 생성한다. [as]를 이용한 타입 캐스팅은 내가 바꾸려는 타입이
    내부 구현에서 사용되는 타입이라면 타입 캐스팅을 성공시킨다. 그러나 내부 구현에서 내가 바꾸고자 하는 타입이
    없는 경우 `ClassCastException`을 발생시킨다.
 */