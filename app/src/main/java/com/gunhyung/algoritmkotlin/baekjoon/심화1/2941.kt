package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val croatiaAlphabet = listOf(
                "c=",
                "c-",
                "dz=",
                "d-",
                "lj",
                "nj",
                "s=",
                "z=",
            )
            var word = readLine()

            for (i in croatiaAlphabet) {
                word = word.replace(i, " ")
            }

            write(word.length.toString())

            close()
        }
        close()
    }
}

fun reference2941() {
    fun main() {
        with(System.`in`.bufferedReader()) {
            with(System.out.bufferedWriter()) {
                val word = readLine()

                write(word.replace(Regex("c=|c-|dz=|d-|lj|nj|s=|z="), " ").length.toString())


                close()
            }
            close()
        }
    }
}