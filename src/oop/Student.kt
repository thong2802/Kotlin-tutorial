package oop

class Student constructor(var studentNumber: String){
//    val firstStudent = "First Student : ${studentNumber}".also(::println)
//    init {
//        println("${studentNumber}")
//    }
//    val second = "Second Student : ${studentNumber.length}".also(::println)
//    init {
//        println("${studentNumber.length}")
//    }
    val subject = mutableListOf<String>()
    init {
        println("studentNumber : $studentNumber")
    }
    constructor(studentNumber: String, initaSubject : List<String>) : this(studentNumber) {
        subject.addAll(initaSubject)
    }
}

fun main() {
    val student = Student("3248475")
    
}