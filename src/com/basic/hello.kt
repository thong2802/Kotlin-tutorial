package com.basic

import kotlin.time.measureTime

class hello {

}
class Rectangle(private var with : Int, private var heigth : Int) {
    fun calculateArea() = with * heigth
    fun printArea() {
        println("Area of Rectangle is ${calculateArea()}")
    }
}
fun main() {
    println(add(5, 8))
    printSum(6,8)
    println(maxOf1(5,8))
    var abc: Int?  = parser("89")
    println(abc)

    println(checkString(7))

    println(length(9))

    println(description(9.3))


    //
    val array = listOf(4,4,65,3,5);
    //val arr = listOf<>()
    for (item in array) {
        println(item)
    }

    for (item in array.indices) {
        println(item)
    }


    var index = 0;
    while (index < array.size){
        println("item at $index is ${array[index]}")
        index ++
    }


    // RANGES
    var rangess : IntRange = 1..9
    for (item in rangess) {
        println(item)
    }
    for (item in rangess step 2) {
        println(item)
    }
    for (item in 9 downTo 0 step 3) {
        println(item)
    }

    println("filter")
    // filter
    var arrays : List<Int> = listOf(-3,-7,-4,1,22,0,5,66,36,12)
    when {
        45 in arrays -> print("true")
        else -> println("false")
    }

    arrays.filter { it > 1 }
        .sortedBy { it }
        .forEach { println(it)}



    val rectangle : Rectangle = Rectangle(6,8);
    rectangle.printArea()
}
fun add( a : Int,  b : Int) = a + b
fun printSum (a : Int, b : Int) : Unit {
    println(add(a, b))
    return Unit;
}

fun maxOf(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    }else{
        return b;
    }
}

fun maxOf1(a : Int, b : Int) = if (a > b) a else b

fun parser(string : String) : Int? {
    return try {
        string.toInt()
    }catch (e : Exception){
        null
    }
}

fun checkString(a : Any) : Boolean? {
    return (a is String)
}

fun length(a : Any) : Int?{
    if (a is String){
        return a.length
    }

    return -1;
}

fun description(obj : Any) : String? = when (obj) {
    1 -> "one"
    "2" -> "two"
    is Long -> "Long"
    else -> null
}
