package com.gunhyung.algoritmkotlin

/*class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        for(i in commands.indices) {
            val n = array.sliceArray((commands[i][0]-1)..(commands[i][1]-1)).toList().sorted()

            answer = answer.plus(n[commands[i][2]-1])
        }

        return answer
    }
}*/