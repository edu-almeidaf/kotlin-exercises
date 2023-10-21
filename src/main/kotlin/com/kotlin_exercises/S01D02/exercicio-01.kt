package com.kotlin_exercises.S01D02

fun main() {
    println("Digite o salário: ")
    val salary = readln().toDouble()
    val updatedSalary = salary * 1.25
    println("O novo salário é igual a $updatedSalary")
}