package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (A, B) = readLine().split(" ").map(String::toInt)
            val collectionA = readLine().split(" ").map(String::toInt).toHashSet()
            val collectionB = readLine().split(" ").map(String::toInt).toHashSet()
            val temp = hashSetOf<Int>()

            temp.addAll(collectionA)

            collectionA.removeAll(collectionB)
            collectionB.removeAll(temp)

            collectionA.addAll(collectionB)
            write(collectionA.size.toString())

            close()
        }
        close()
    }
}