package com.gunhyung.algoritmkotlin.inflearn

fun main() {
    val target = 5
    val array = intArrayOf(2,1,3,5,6,8,4)

    binarySearch(array.sortedArray(), target).also {
        println(it)
    }

}

fun binarySearch(array: IntArray, target: Int): Int {
    var low = 0
    var high = array.size - 1

    while (low <= high) {
        val mid = (low + high) / 2

        if (array[mid] == target) { return mid }
        else if(array[mid] > target) { high = mid - 1 }
        else low = mid + 1
    }

    return -1
}