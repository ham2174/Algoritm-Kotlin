package com.gunhyung.algoritmkotlin.baekjoon.정렬

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val list = arrayListOf<Int>()

            for (i in 0 until N) {
                list.add(readLine().toInt())
            }

            list.sort()

            for (i in 0 until N) {
                write(list[i].toString() + "\n")
            }

            close()
        }
        close()
    }
}

/*
해당 함수가 더 시간이 오래 걸린다. 이유는 `sorted`를 사용하여 새로운 리스트를 만든 후
해당 리스트를 메모리에 할당해주는데 시간이 걸리기 때문이다. `sort`를 사용하였을 때에는
기존 리스트에 정렬되어 값만 변경되기 때문에, 새로운 리스트를 생성하는 시간을 절약할 수 있다.

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val N = readLine().toInt()
            val list = arrayListOf<Int>()

            for (i in 0 until N) {
                list.add(readLine().toInt())
            }

            list.sorted().let {
                for (i in 0 until N) {
                    write(it[i].toString() + "\n")
                }
            }

            close()
        }
        close()
    }
}
 */