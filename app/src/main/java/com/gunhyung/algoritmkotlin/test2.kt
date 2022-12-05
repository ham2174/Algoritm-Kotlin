package com.gunhyung.algoritmkotlin

fun main() {
    val animalList = arrayListOf<Animal>()

    animalList.add(Animal("개1",68, "red", "dog"))
    animalList.add(Animal("개2",70, "blue", "dog"))
    animalList.add(Animal("고양이1",10, "black", "cat"))
    animalList.add(Animal("고양이2",8, "yellow", "cat"))
    animalList.add(Animal("닭1",20, "green", "chicken"))
    animalList.add(Animal("닭2",17, "purple", "chicken"))

    for (i in animalList.indices) {
        animalList[i].speak()
    }
}

class Animal(
    val name: String,
    val weight: Int,
    val color:String,
    private val kind: String
) {
    fun speak() {
        if(kind == "dog") {
            print("멍멍!")
        }
        if(kind == "cat") {
            print("야옹!")
        }
        if(kind == "chicken") {
            print("꼬꼬댁!")
        }
    }
}
