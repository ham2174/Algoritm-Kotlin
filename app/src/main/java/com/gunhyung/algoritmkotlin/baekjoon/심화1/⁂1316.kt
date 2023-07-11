package com.gunhyung.algoritmkotlin.baekjoon.심화1

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            var groupWords = N

            repeat(N) {
                val word = readLine()
                val charSet = mutableSetOf<Char>()
                var lastChar = ' '
                var isGroupWord = true

                word.forEach { alphabet ->
                    if (lastChar != alphabet) {
                        lastChar = alphabet
                        if (!charSet.add(alphabet)) {
                            isGroupWord = false
                        }
                    }
                }
                if (!isGroupWord) groupWords--
            }

            write(groupWords.toString())

            close()
        }
        close()
    }
}

/**
 * Set 컬렉션은 중복된 값을 넣을 수 없다는것을 잊지 말자.
 * Mutable 한 배열과 리스트에서 값을 추가하면 반환값은 Boolean 이라는 것을 잊지말자.
 */
fun reference1316() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            var groupWords = N

            repeat(N) {
                val word = readLine()
                val charSet = mutableSetOf<Char>()
                var lastChar = ' '
                var isGroupWord = true

                word.forEach { alphabet ->
                    if (lastChar != alphabet) {
                        lastChar = alphabet
                        if (!charSet.add(alphabet)) {
                            isGroupWord = false
                        }
                    }
                }
                if (!isGroupWord) groupWords--
            }

            write(groupWords.toString())

            close()
        }
        close()
    }
}