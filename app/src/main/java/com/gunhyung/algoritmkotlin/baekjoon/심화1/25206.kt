package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val score = mapOf(
                "A+" to 4.5,
                "A0" to 4.0,
                "B+" to 3.5,
                "B0" to 3.0,
                "C+" to 2.5,
                "C0" to 2.0,
                "D+" to 1.5,
                "D0" to 1.0,
                "F" to 0.0,
            )
            var gradeTotal = 0.0
            var creditTotal = 0.0

            for (i in 0 until 20) {
                val input = readLine().split(" ")
                val credit = input[1].toDouble()
                val grade = input[2]

                if (grade == "P") {
                    continue
                } else {
                    gradeTotal += credit * score[grade]!!
                    creditTotal += credit
                }
            }

            write("%.6f".format(gradeTotal / creditTotal))

            close()
        }
        close()
    }
}
