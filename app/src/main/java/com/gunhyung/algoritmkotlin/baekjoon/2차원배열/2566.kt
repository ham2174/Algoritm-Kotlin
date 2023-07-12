package com.gunhyung.algoritmkotlin.baekjoon.`2차원배열`

fun main() {
    with(System.`in`.bufferedReader()) {
        with(System.out.bufferedWriter()) {
            val gridPlate: List<List<Int>> = List(9) {
                readLine().split(" ").map(String::toInt)
            }

            val max = gridPlate.flatten().max()

            write(max.toString() + "\n")

            for (i in 0 until 9) {
                if (gridPlate[i].contains(max)) {
                    write("${i + 1} ${gridPlate[i].indexOf(max) + 1}")
                    break
                }
            }

            close()
        }
        close()
    }
}

/**
 * flatten() 함수는 2차원 배열을 1차원 배열로 만들어주는 코틀린 내장 함수이다.
 * 잘 활용해보자.
 * 그런데 이 함수는.. 잘 사용해야될것 같다...
 * 해당 함수의 구현부를 보면 ArrayList로 다차원 배열의 모든 요소를 집어넣어 List로 반환을 해준다.
 * 예를들어 10000 x 10000 크기의 2차원 배열이 있다고 가정했을 때, 약 100,000,000의 데이터를 ArrayList에 저장한다.
 * 그러나 이 상황은 메모리 사용에 큰 영향을 끼쳐 성능 저하를 유발한다.
 * 그러므로 해당 함수는 작은 데이터를 가지는 다차원 배열일 때 사용하자.
 */