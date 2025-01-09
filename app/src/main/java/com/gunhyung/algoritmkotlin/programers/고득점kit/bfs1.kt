package com.gunhyung.algoritmkotlin.programers.고득점kit

fun main() {
    val numbers = intArrayOf(4, 1, 2, 1)
    val target = 4
    var answer = 0

    var tree = arrayListOf(0) // tree는 모든 경우의 수의 합을 가지고 있는다. 최초의 합 값은 0 이다.


    numbers.forEach { value -> // numbers의 각 인덱스마다 더하거나 빼야하니까 numbers 배열만큼 반복한다.
        val child = arrayListOf<Int>() // 자식 노드를 생성한다.

        tree.forEach { parent -> // 부모 노드의 갯수만큼 반복한다. 자식노드의 값이 쌓이면 이후에 부모 노드로 복사한다.
            child.add(parent + value) // 자식 노드에 값을 추가한다.
            child.add(parent - value) // 더하거나 뺀 두개의 값 모두 추가해야 하므로 +, - 인 경우를 추가한다.
        }

        tree = child // 부모 노드에 자식 노드를 복사한다.
    } // 다음 numbers의 인덱스 값으로 재시작한다.

    tree.count { it == target }
    println(answer)

}