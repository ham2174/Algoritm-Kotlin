package com.gunhyung.algoritmkotlin.programers

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.max

class `성격_유형_검사하기` {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var result = ""

        val map: LinkedHashMap<Char, Int> = linkedMapOf(
            'R' to 0,
            'T' to 0,
            'C' to 0,
            'F' to 0,
            'J' to 0,
            'M' to 0,
            'A' to 0,
            'N' to 0,
        )

        // choices[i]에 따라 점수 부여가 달라진다.
        // choices[i]의 값이 1~3일 때 4~6일 때 5일 때 점수가 나뉨
        for (i in survey.indices) { // 문제 갯수만큼 반복
            val score = abs(choices[i] - 4)
            when (choices[i]) {
                in 1..3 -> {
                    val uHyung = survey[i][0]
                    val default = map[uHyung]!!
                    map[uHyung] = default + score
                }

                in 5..7 -> {
                    val uHyung = survey[i][1]
                    val default = map[uHyung]!!
                    map[uHyung] = default + score
                }
                4 -> {
                    continue
                }
            }
        }

        result += if (map['R']!! >= map['T']!!) 'R' else 'T'
        result += if (map['C']!! >= map['F']!!) 'C' else 'F'
        result += if (map['J']!! >= map['M']!!) 'J' else 'M'
        result += if (map['A']!! >= map['N']!!) 'A' else 'N'

        return result
    }

}