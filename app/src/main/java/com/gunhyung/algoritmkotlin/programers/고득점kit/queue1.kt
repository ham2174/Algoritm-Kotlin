package com.gunhyung.algoritmkotlin.programers.고득점kit

import java.util.LinkedList

fun main() {
    val progresses = intArrayOf(95, 90, 99, 99, 80, 99)
    val speeds = intArrayOf(1, 1, 1, 1, 1, 1)
    val test = LinkedList<Int>().apply { addAll(progresses.toList()) }

    val queue = LinkedList<Pair<Int, Int>>().apply { // Pair로 진행도-속도를 키-값으로 만든다.
        addAll(progresses.zip(speeds)) // LinkedList의 addAll() 함수의 인자는 컬렉션 함수만 넣을 수 있음
    }                                  // .zip() 함수는 map 으로 만들어줌.
                                       // .zip() 함수의 리시버인 progresses의 각 인덱스를 키로
                                       // .zip() 함수의 파라미터인 speeds의 각 인덱스가 값으로 맵핑된다.
    val answer = arrayListOf<Int>()

    while (queue.isNotEmpty()) { // queue를 모두 소모할 때 까지 반복한다.
        var count = 0 // 반복문이 돌 때 queue에서 꺼낸 인덱스의 갯수가 몇개인지 count에 저장한다.
                      // while문 마지막에 count가 0이 아닐때 answer에 count를 추가한다.

        queue.forEachIndexed { index, pair -> // 반복문 1회 = 1일 이라고 생각하여 하루에 각 기능별 진행도를 구한다.
            queue[index] = pair.copy(first = pair.first + pair.second) // 진행도-속도로 맵핑했기 때문에 하루치 작업량을 각 기능별로 더한다.
        }

        run { // while문 안에 내부 while문을 사용할 경우 내부 while만 멈추기 위해 run을 사용한다.
            while (queue.isNotEmpty()) { 
                if (queue[0].first >= 100) { // 0번째 인덱스가 100점 이상일 때 실행된다.
                    queue.pop() // pop을 해주고
                    count++ // 진행도가 100이상인 기능이 배포 되었으니 count의 갯수도 증가시킨다.
                } else { // 만일 0번째 인덱스가 100점 이상이 아니면
                    return@run // 해당 while문을 빠져나온다.
                }
            }
        }

        if (count != 0) { // count가 0일수도 있으니 0인경우는 제외하고 answer에 count를 추가한다.
            answer.add(count)
        }
    }

    println(answer)
}