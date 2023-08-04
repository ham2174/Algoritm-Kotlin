package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val users = ArrayList<User>()

            for (i in 0 until N) {
                val (age, name) = readLine().split(" ")

                users.add(User(name = name, age = age.toInt(), joinNumber = i))
            }

            users.sortedWith(compareBy<User> { it.age }.thenBy { it.joinNumber })
                .forEach {
                    write("${it.age} ${it.name}\n")
                }

            close()
        }
        close()
    }
}

data class User(
    val name: String,
    val age: Int,
    val joinNumber: Int
)