package com.kotlin_exercises.S01D02

fun main() {
    println("Digite a altura do degrau da escada em metros: ")
    val step = readln().toDouble()

    println("Digite em metros qual altura você deseja alcançar com a escada: ")
    val stair = readln().toDouble()

    val distance = stair / step

    println("Você precisará subir $distance degraus")
}