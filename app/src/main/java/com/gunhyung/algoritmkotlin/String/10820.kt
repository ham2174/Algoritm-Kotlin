package com.gunhyung.algoritmkotlin.String

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()

    while (true) {
        var countArray = MutableList<Int>(4) { i -> i }
        val n = readLine()?.toString()?: break

        for (i in n) {
            when(i) {
                in 'a'..'z' -> countArray[0]++
                in 'A'..'Z' -> countArray[1]++
                in '0'..'9' -> countArray[2]++
                ' ' -> countArray[3]++
            }
        }
        sb.append(countArray[0]).append(" ")
            .append(countArray[1]).append(" ")
            .append(countArray[2]).append(" ")
            .append(countArray[3]).append("\n")
    }

    println(sb)
}