package com.gunhyung.algoritmkotlin.baekjoon.집합과맵

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val (N, M) = readLine().split(" ").map(String::toInt)
            val pokemonBookForName = linkedMapOf<String, Int>()
            val pokemonBookForNumber = linkedMapOf<Int, String>()

            for (i in 1..N) {
                val name = readLine()

                pokemonBookForName[name] = i
                pokemonBookForNumber[i] = name
            }

            for (i in 0 until M) {
                val question = readLine()

                if (pokemonBookForName.contains(question)) {
                    write(pokemonBookForName[question].toString() + "\n")
                } else {
                    write(pokemonBookForNumber[question.toInt()].toString() + "\n")
                }
            }

            close()
        }
        close()
    }
}