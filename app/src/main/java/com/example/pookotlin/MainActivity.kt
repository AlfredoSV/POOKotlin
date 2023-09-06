package com.example.pookotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var alfredo : Student = Student()

        alfredo.setName("Alfredp")
        alfredo.setAge(25)
        alfredo.setGrade("Universitario")

        println(alfredo.getName())
        println(alfredo.getAge())
        println(alfredo.getGrade())
        println(alfredo)
        println(alfredo.hi())

        var jorge : Teacher = Teacher("Jorge",4);

        println(jorge)
        jorge.hi()
    }
}