package oop_118051_gavrieldonovan.week03

fun main() {
    /*
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
    */

    val banagnum = Weapon("Banagnum")
    banagnum.damage = -50
    println("Damage weapon ${banagnum.name}: ${banagnum.damage}")
    banagnum.damage = 9999
    println("Damage weapon ${banagnum.name}: ${banagnum.damage}")
    println("Tier weapon ${banagnum.name}: ${banagnum.tier}")
}