package com.gunhyung.algoritmkotlin

import java.util.Collections

fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ").map { it.toInt() }
    val arr1 = arr.toMutableSet().toList()

    val solution = mutableListOf<Int>()

    for (i in arr1.indices) {
        val a = Collections.frequency(arr, arr1[i])

        if (a != 1) {
            solution.add(a)
        }else if (i == arr1.size-1 && solution.isEmpty()) {
            solution.add(-1)
        }
    }

    println(solution)
}

// arr = [1, 2, 3, 3, 3, 3, 4, 4]에서 3은 4번, 4는 2번씩 나타나므로 [4, 2]를 반환합니다.
// [3, 5, 7, 9, 1]에서 중복해서 나타나는 숫자는 없으므로 [-1]을 반환합니다.
// arr = [3, 2, 4, 4, 2, 5, 2, 5, 5]이면 2가 3회, 4가 2회, 5가 3회 나타나므로 [3, 2, 3]를 반환합니다.