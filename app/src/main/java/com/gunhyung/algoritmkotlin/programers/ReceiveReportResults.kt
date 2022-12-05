package com.gunhyung.algoritmkotlin.programers

import android.os.Build
import androidx.annotation.RequiresApi

/*class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var sameNum = 0
        var unknownNum = 0

        lottos.sort()
        win_nums.sort()

        for(i in lottos.indices) {
            for(j in win_nums.indices) {
                if(lottos[i] == win_nums[j]) {
                    sameNum++
                }
            }
            if(lottos[i] == 0) {
                unknownNum++
            }
        }

        var maxNum = sameNum + unknownNum
        var minNum = sameNum - unknownNum

        when(maxNum) {
            6 ->
                answer[0] = 1
            5 ->
                answer[0] = 2
            4 ->
                answer[0] = 3
            3 ->
                answer[0] = 4
            2 ->
                answer[0] = 5
            1, 0 ->
                answer[0] = 6
        }

        when(minNum) {
            6 ->
                answer[1] = 1
            5 ->
                answer[1] = 2
            4 ->
                answer[1] = 3
            3 ->
                answer[1] = 4
            2 ->
                answer[1] = 5
            1, 0 ->
                answer[1] = 6
        }

        return answer
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