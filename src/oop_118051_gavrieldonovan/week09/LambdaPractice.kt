package oop_118051_gavrieldonovan.week09

fun main() {
    println("=== TEST LAMBDA ===")
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(10, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}