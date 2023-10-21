package com.kotlin_exercises.S01D02

fun main() {
    println("Digite o primeiro número: ")
    val firstNumber = readln().toDouble()

    println("Digite o segundo número: ")
    val secondNumber = readln().toDouble()

    val higherNumber = if (firstNumber > secondNumber) firstNumber else secondNumber

    println("O maior número é $higherNumber")
}