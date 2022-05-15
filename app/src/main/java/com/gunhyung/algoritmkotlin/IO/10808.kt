package com.gunhyung.algoritmkotlin.IO

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().map { it.toChar() }
    val arr = Array<Int>(26){ _ -> 0 }
    var tmp = 0

    for(i in a.indices) {
        for(j in 'a' .. 'z') {
            if(a[i] == j){
                arr[tmp]++
                tmp = 0
                break
            }
            tmp++
        }
    }

    arr.forEach { print(it); print(" ") }
}