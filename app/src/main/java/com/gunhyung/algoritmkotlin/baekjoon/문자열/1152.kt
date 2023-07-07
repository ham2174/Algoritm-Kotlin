package com.gunhyung.algoritmkotlin.baekjoon.문자열

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.StringTokenizer

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val test = readLine().split(" ").toMutableList()

            test.removeIf { it == "" }

            write(test.size.toString())

            close()
        }
        close()
    }
}

/**
 * StringTokenizer를 사용하면 공백을 제외하고 1단어씩 하나의 토큰으로 저장한다.
 */
fun reference1152() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            write(StringTokenizer(readLine()).countTokens().toString())

            close()
        }
        close()
    }
}