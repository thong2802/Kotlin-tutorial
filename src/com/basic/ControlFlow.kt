package com.basic

class ControlFlow {
}

fun main() {
    val a : Any = 6
    when (a) {
        is Byte -> {
            println("a is byte")
        }
        is Short -> {
            println("a is short")
        }
        is Int -> {
            println("a is Int")
        }
        else -> {
            println("we don't know")
        }
    }

    fun checkOdd(b : Int) = b % 2 == 0
    val b = 6
    val result = when(val isOdd = checkOdd(b)) {
        true -> isOdd.toString()
        else -> "Not"
    }
    println(result)

    val array = arrayOf(1, 3, 4, 5, 6, 7)
    for (item in array) println(item)
    for (i in 10 downTo 0 step 3) println(i)
    for ((index, item) in array.withIndex()) println("index $index is $item")

    fun containNumber(a : Int, list : List<Int>): Boolean {
        var result = false;
        check@for (i in list){
            if (i == a){
                result = true
                break@check
            }else{
                continue@check
            }
        }
        return result
    }
    println(containNumber(6, Array(3){i -> i}.toList()))


}
