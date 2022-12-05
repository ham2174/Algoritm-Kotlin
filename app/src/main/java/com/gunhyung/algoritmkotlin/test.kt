package com.gunhyung.algoritmkotlin

import android.os.Build
import androidx.annotation.RequiresApi

/*fun main() {
    val id_list: Array<String> = arrayOf("muzi", "frodo", "apeach", "neo")
    val report: Array<String> = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "muzi frodo")
    val k: Int = 2

    val answer = IntArray(id_list.size) { 0 }

    val reporter = arrayListOf<String>() // 신고자
    val reported = arrayListOf<String>() // 신고받은 자
    val cumulative = IntArray(id_list.size) { 0 } // 누적 신고 횟수
    val reportConfirmation = arrayListOf<String>() // 확정된 신고받은 자

    for(i in report.distinct().indices) {
        report[i].split(" ").also {
            reporter.add(it[0])
            reported.add(it[1])
        }

        cumulative[id_list.indexOf(reported[i])]++
    }

    for (i in cumulative.indices) {
        if (k <= cumulative[i]) {
            reportConfirmation.add(id_list[i])
        }
    }

    for (i in reporter.indices) {
        for (j in reportConfirmation.indices) {
            if(reportConfirmation[j] == reported[i]) {
                answer[id_list.indexOf(reporter[i])]++
            }
        }
    }

    println(reporter)
    println(reported)

    for (i in cumulative.indices) {
        println(answer[i])
    }
}*/

class Solution {
    @RequiresApi(Build.VERSION_CODES.N)
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray =
        report.map { it.split(" ") }
            .groupBy { it[1] }
            .asSequence()
            .map { it.value.distinct() }
            .filter { it.size >= k }
            .flatten()
            .map { it[0] }
            .groupingBy { it }
            .eachCount()
            .run { id_list.map { getOrDefault(it, 0) }.toIntArray() }
}