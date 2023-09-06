package com.example.pookotlin

class Teacher( name : String = "Anonimo",  age : Int = 0) : Person(name,age) {

    override fun hi() {
        println("Hi, i am a teacher")
    }

}