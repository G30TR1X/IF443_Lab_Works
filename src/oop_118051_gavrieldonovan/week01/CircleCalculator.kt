package oop_118051_gavrieldonovan.week01

fun main() {
    val radius: Double = 7.0
    val pi: Double = 3.14

    var area= pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}
fun checkSize(area: Double): String = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
