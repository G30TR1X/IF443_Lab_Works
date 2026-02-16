package oop_118051_gavrieldonovan.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test validasi salary
    e.salary = -1000 // Harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Coba uncomment, pasti Merah (error)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}