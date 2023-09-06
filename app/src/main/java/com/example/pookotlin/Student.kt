package com.example.pookotlin

class Student( name : String = "Anonimo",  age : Int = 0,private var grade : String = "Anonimo") :
    Person(name,age){


    public fun getGrade() : String{
        return this.grade
    }

    public fun setGrade(grade : String) {
        this.grade = grade;
    }

    override fun toString(): String {
        return "Student(name='${this.getName()}', age='${this.getAge()}', grade='${this.getGrade()}')"
    }

    override fun hi(){
        //super.hi()
        println("Hi, i am a student")
    }

}