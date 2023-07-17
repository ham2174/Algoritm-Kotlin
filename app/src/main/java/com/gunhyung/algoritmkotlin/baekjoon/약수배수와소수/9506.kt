package com.gunhyung.algoritmkotlin.baekjoon.약수배수와소수

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            while (true) {
                val case = readLine().toInt()

                if (case == -1) break
                else {
                    val result = arrayListOf<Int>()
                    var temp = 0

                    for (i in 1..case) {
                        if (case % i == 0 && i != case) {
                            result.add(i)
                        }
                    }

                    for (i in result) {
                        temp += i
                    }

                    if (temp == case) {
                        write("$case =")
                        for (i in result.indices) {
                            if (i == result.lastIndex) {
                                write(" ${result[i]}")
                            } else {
                                write(" ${result[i]} +")
                            }
                        }
                    } else {
                        write("$case is NOT perfect.")
                    }

                    write("\n")
                }
            }

            close()
        }
        close()
    }
}