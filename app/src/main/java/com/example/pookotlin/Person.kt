package com.example.pookotlin

open class Person (private var name : String = "Anonimo", private  var age : Int = 0){

    public fun getName() : String{
        return this.name
    }

    public fun setName(name : String){
        this.name = name
    }

    public fun getAge() : Int{
        return this.age
    }

    public fun setAge(age : Int){
        this.age = age
    }

    override fun toString(): String {
        return "Object Person(name='$name', age=$age)"
    }

    open public fun  hi(){
        println("Hi, i am a person")
    }

}

