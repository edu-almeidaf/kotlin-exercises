package com.kotlin_exercises.S01D02

fun main() {
    println("Digite a primeira nota: ")
    val firstGrade = readln().toDouble()

    println("Digite a segunda nota: ")
    val secondGrade = readln().toDouble()

    println("Digite a terceira nota: ")
    val thirdGrade = readln().toDouble()

    val average = (firstGrade + secondGrade + thirdGrade) / 3

    if (average >= 0 && average < 3) {
        println("REPROVADO")
    } else if (average >= 3 && average < 7) {
        println("EXAME")
    } else {
        println("APROVADO")
    }
} 