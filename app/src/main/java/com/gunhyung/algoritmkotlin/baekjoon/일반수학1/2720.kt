package com.gunhyung.algoritmkotlin.baekjoon.일반수학1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val quarter = 25
            val dime = 10
            val nickel = 5
            val penny = 1

            val T = readLine().toInt()

            for (i in 0 until T) {
                val C = readLine().toInt()

                val value0 = C / quarter
                val value1 = (C % quarter) / dime
                val value2 = (C % quarter % dime) / nickel
                val value3 = (C % quarter % dime % nickel) / penny

                write("$value0 $value1 $value2 $value3\n")
            }

            close()
        }
        close()
    }
}
