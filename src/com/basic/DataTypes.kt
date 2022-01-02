package com.basic

class DataTypes {

}

fun main() {
    var r = 1..9
    var x = 3
    if (x in r) print(x)

    println(decimalDigitValue('9'))

    //
    val a = arrayOf(1,"2",5)
    val aNull = arrayOfNulls<Int>(5)
    val asc = Array(4) {i -> (i * i).toString()}
    asc.forEach { println(it) }

}

fun decimalDigitValue(c : Char) : Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out og Ranges")
    return c.toInt() - '0'.toInt()
}
